package entities;

public class Product {

  private String name;
  private double price;
  private int quantity;
  private boolean updated = false;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  private double TotalValueInStock() {
    return price * quantity;
  }

  public void AddProducts(int quantity) {
    this.updated = true;
    this.quantity += quantity;
  }

  public void RemoveProducts(int quantity) {
    this.updated = true;
    this.quantity -= quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    if (this.updated) {
      return String.format("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price,
          quantity, TotalValueInStock());
    }
    return String.format("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price,
        quantity, TotalValueInStock());
  }

}
