package entities;

public class OutsourcedEmployee extends Employee {
  Double additionCharge;

  public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionCharge) {
    super(name, hours, valuePerHour);
    this.additionCharge = additionCharge;
  }

  @Override
  final public String toString() {
    return String.format("%s - $ %.2f", name, hours * valuePerHour + additionCharge * 1.1);
  }
}
