package entities;

public class Product {
  private String name;
  private Double price;
  private Integer quantity;

  public Product(String name, Double price, Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public Double getTotal() {
    return price * quantity;
  }

  public String getName() {
    return this.name;
  }
}
