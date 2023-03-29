package application;

import java.util.Scanner;

import entities.Product;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data:");
    System.out.print("Name: ");
    String name = sc.next();
    System.out.print("Price: ");
    double price = sc.nextDouble();
    System.out.print("Quantity in stock: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);

    System.out.println();
    System.out.print(product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    product.AddProducts(sc.nextInt());

    System.out.println();
    System.out.print(product);

    System.out.println();
    System.out.print("Enter the number of products to be removed in stock: ");
    product.RemoveProducts(sc.nextInt());

    System.out.println();
    System.out.print(product);

    sc.close();
  }

}