package bank;

public class Costumer {
  private int id;
  private String name;
  private String username;
  private String password;
  private int accountid;

  public Costumer(int id, String name, String username, String password, int accountid) {
    setid(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountid(accountid);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountid() {
    return this.accountid;
  }

  public void setAccountid(int accountid) {
    this.accountid = accountid;
  }


}
