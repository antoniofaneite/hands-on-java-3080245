package bank;

public class Account {
  private int id;
  private String type;
  private int balance;


  public Account(int id, String type, int balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }



}
