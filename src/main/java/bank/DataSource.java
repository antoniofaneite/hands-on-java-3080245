package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DataSource {
    
    public static Connection connect() {
      String db_file = "jdbc:sqlite:resources/bank.db";
      Connection connection = null;
      try{
        connection = DriverManager.getConnection(db_file);
        System.out.println("Connection to SQLite has been established.");
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return connection;
    }

    public static Customer getCustomer(String username){
      String sql = "SELECT * FROM customers WHERE username = ?";
      Customer customer = null;

      try (Connection connection = connect();
          PreparedStatement statement = connection.prepareStatement(sql)) {
        // Set the value of the parameter in the SQL statement

        statement.setString(1, username);
        try(ResultSet resultSet = statement.executeQuery()){
          customer = new Customer(
            resultSet.getInt("id"), 
            resultSet.getString("name"),
            resultSet.getString("username"),
            resultSet.getString( "password"),
            resultSet.getInt("account_Id")
          );

        }

      } catch(SQLException e) {
        e.printStackTrace();
      }
      return customer;

    }

    public static Account getAccount(int accountid){

      String sql = "SELECT * FROM accounts WHERE id = ?";
      Account account = null;

      try (Connection connection = connect();
          PreparedStatement statement = connection.prepareStatement(sql)) {
        // Set the value of the parameter in the SQL statement

        statement.setInt(1, accountid);
        try(ResultSet resultSet = statement.executeQuery()){
          account = new Account(
              resultSet.getInt("id"),
              resultSet.getString("type"),
              resultSet.getDouble("balance")
          );

        }

      } catch(SQLException e) {
        e.printStackTrace();
      }
      return account;

    }

    public static void main(String[] args) {
        Customer customer = getCustomer( "cpidon69@feedburner.com");
        Account account = getAccount(customer.getAccountid());
        System.out.println(account.getBalance());
    }
}
