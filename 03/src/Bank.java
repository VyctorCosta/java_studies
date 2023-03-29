
import java.util.Scanner;

import entities.Account;

public class Bank {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Account acc;

    System.out.print("Enter account number: ");
    final int accountNumber = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter account holder: ");
    final String titularName = sc.nextLine();
    System.out.print("Is there an initial deposit (y/n)? ");
    final char isInitialDeposit = sc.next().charAt(0);

    if (isInitialDeposit == 'y') {
      System.out.print("Enter initial deposit value: ");
      final double initialDeposit = sc.nextDouble();
      acc = new Account(accountNumber, titularName, initialDeposit);
    } else {
      acc = new Account(accountNumber, titularName);
    }

    System.out.println();
    System.out.println(acc);

    System.out.println();
    System.err.print("Enter a deposit value: ");
    final double depositValue = sc.nextDouble();
    acc.deposit(depositValue);
    System.out.println(acc);

    System.out.println();
    System.err.print("Enter a withdraw value: ");
    final double withdrawValue = sc.nextDouble();
    acc.withdraw(withdrawValue);
    System.out.println(acc);

    sc.close();
  }

}