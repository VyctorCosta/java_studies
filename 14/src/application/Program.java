package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import service.CalculationService;

public class Program {

  public static void main(String[] args) {
    final String path = System.getProperty("user.dir");
    final List<Product> products = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path + "/src/products.csv"))) {
      String line = br.readLine();
      String[] field;

      while (line != null) {
        field = line.split(",");
        products.add(new Product(field[0], Double.parseDouble(field[1])));
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Most expensive:");
    final Product max_product = CalculationService.max(products);
    System.out.printf("%s, %.2f%n", max_product.getName(), max_product.getPrice());
  }

}