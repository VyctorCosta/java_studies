package application;

import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of employees: ");
    final int numEmployees = sc.nextInt();
    final Employee[] arrayEmployees = new Employee[numEmployees];
    sc.nextLine();

    for (int i = 0; i < numEmployees; i++) {
      System.out.printf("Employee #%d data:%n", i + 1);
      System.out.print("Outsourced (y/n)? ");
      char outsourced = sc.next().charAt(0);

      sc.nextLine();
      System.out.printf("Name: ");
      String name = sc.nextLine();
      System.out.printf("Hours: ");
      Integer hours = sc.nextInt();
      System.out.printf("Value per hour: ");
      Double valuePerHour = sc.nextDouble();

      if (outsourced == 'y') {
        System.out.printf("Additional charge: ");
        Double additionalCharge = sc.nextDouble();
        arrayEmployees[i] = (Employee) new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
        continue;
      }

      arrayEmployees[i] = new Employee(name, hours, valuePerHour);
    }
    System.out.println();
    System.out.println("PAYMENTS");
    for (Employee employee : arrayEmployees) {
      System.out.println(employee);
    }

    sc.close();
  }

}