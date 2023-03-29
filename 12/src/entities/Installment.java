package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
  private LocalDate due_date;
  private Double amount;
  private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public Installment() {
  }

  public Installment(LocalDate due_date, Double amount) {
    this.due_date = due_date;
    this.amount = amount;
  }

  public LocalDate getDueDate() {
    return this.due_date;
  }

  public void setDue_date(LocalDate due_date) {
    this.due_date = due_date;
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return String.format("%s - %.2f", due_date.format(fmt), amount);
  }

}
