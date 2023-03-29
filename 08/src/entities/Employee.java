package entities;

public class Employee {
  String name;
  Integer hours;
  Double valuePerHour;

  public Employee(String name, Integer hours, Double valuePerHour) {
    this.name = name;
    this.hours = hours;
    this.valuePerHour = valuePerHour;
  }

  @Override
  public String toString() {
    return String.format("%s - $ %.2f", name, hours * valuePerHour);
  }

}