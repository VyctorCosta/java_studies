package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

  public static void main(String[] args) {
    System.out.println("Running Program...");
    String absolutePath = System.getProperty("user.dir");
    final List<Product> arrayProducts = new ArrayList<>();
    // * Reading products.csv
    try (BufferedReader br = new BufferedReader(new FileReader(absolutePath + "/src/products.csv"))) {
      String row = br.readLine();
      while (row != null) {
        String[] slipttedRow = row.split(",");
        arrayProducts
            .add(new Product(slipttedRow[0], Double.parseDouble(slipttedRow[1]),
                Integer.parseInt(slipttedRow[2])));
        row = br.readLine();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    new File(absolutePath + "/out").mkdir();

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(absolutePath +
        "/out/summary.csv"))) {
      for (Product prod : arrayProducts) {
        bw.write(String.format("%s,%.2f", prod.getName(), prod.getTotal()));
        bw.newLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    System.out.printf("summary.csv file generated in %s%n", absolutePath + "/out/summary.csv");
  }

}