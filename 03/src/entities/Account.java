package entities;

public class Account {
  private int accountNumber;
  private String titularName;
  private double balance;
  private boolean hasChange = false;

  public Account(int accountNumber, String titularName) {
    this.accountNumber = accountNumber;
    this.titularName = titularName;
  }

  public Account(int accountNumber, String titularName, double initialValue) {
    this.accountNumber = accountNumber;
    this.titularName = titularName;
    deposit(initialValue);
  }

  public void setTitularName(String titularName) {
    this.hasChange = true;
    this.titularName = titularName;
  }

  public void deposit(double depositValue) {
    this.hasChange = true;
    this.balance += depositValue;
  }

  public void withdraw(double draftValue) {
    this.hasChange = true;
    this.balance -= draftValue + 5.00;
  }

  public String toString() {
    if (hasChange) {
      return String.format("Updated account data:%nAccount %d, Holder: %s, Balance: $ %.2f", accountNumber, titularName,
          balance);
    }
    return String.format("Account data:%nAccount %d, Holder: %s, Balance: $ %.2f", accountNumber, titularName, balance);
  }

}
