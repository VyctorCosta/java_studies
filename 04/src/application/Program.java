package application;

import java.util.Scanner;

import entities.Students;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Students[] pensionato = new Students[10];
    String name;
    String email;
    int room;

    System.out.print("How many rooms will be rented? ");
    final int numberRooms = sc.nextInt();
    sc.nextLine();
    System.out.println();

    for (int i = 0; i < numberRooms; i++) {
      System.out.println("Rent #" + Integer.toString(i + 1));
      System.out.print("Name: ");
      name = sc.nextLine();
      System.out.print("Email: ");
      email = sc.nextLine();
      System.out.print("Room: ");
      room = sc.nextInt();
      sc.nextLine();

      pensionato[room] = new Students(name, email);
      System.out.println();
    }

    System.out.println("Busy rooms: ");
    for (int i = 0; i < pensionato.length; i++) {
      Students student = pensionato[i];
      if (student != null) {
        System.out.printf("%d: %s%n", i, student);
      }
    }

    sc.close();
  }

}
