package entities;

public class Students {

  private String name;
  private String email;

  public Students(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public String toString() {
    return String.format("%s, %s", name, email);
  }

}