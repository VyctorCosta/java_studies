package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Rent;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Enter rental data");
    System.out.print("Car model: ");
    String car_model = sc.nextLine();
    System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
    String pickup_date = sc.nextLine();
    System.out.print("Return (dd/MM/yyyy hh:ss): ");
    String return_date = sc.nextLine();
    System.out.print("Enter price per hour: ");
    Double price_per_hour = sc.nextDouble();
    System.out.print("Enter price per day: ");
    Double price_per_day = sc.nextDouble();

    Rent rent = new Rent(LocalDateTime.parse(pickup_date, fmt), LocalDateTime.parse(return_date, fmt), price_per_hour,
        price_per_day);
    System.out.printf("INVOICE: (%s)%n", car_model);
    System.out.printf("Basic payment: %.2f%n", rent.getBasicPayment());
    System.out.printf("Tax: %.2f%n", rent.getTax());
    System.out.printf("Total payment: %.2f%n", rent.getTotalPayment());

    sc.close();
  }

}
