package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter account data");
      System.out.print("Number: ");
      final Integer number = sc.nextInt();
      System.out.print("Holder: ");
      sc.nextLine();
      final String holder = sc.nextLine();
      System.out.print("Initial balance: ");
      final Double balance = sc.nextDouble();
      System.out.print("Withdraw limit: ");
      Double withdraw = sc.nextDouble();

      final Account acc = new Account(number, holder, balance, withdraw);

      System.out.println();
      System.out.print("Enter amount for withdraw: ");
      withdraw = sc.nextDouble();
      acc.withdraw(withdraw);
      System.out.printf("New balance: %.2f%n", acc.getBalance());

    } catch (InputMismatchException e) {
      System.out.println("Input invalid");
    } catch (DomainException e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }

}
