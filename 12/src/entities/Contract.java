package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

  private Integer number;
  private LocalDate date;
  private Double total_value;
  final private List<Installment> installments = new ArrayList<>();

  public Contract() {
  }

  public Contract(Integer number, LocalDate date, Double total_value) {
    this.number = number;
    this.date = date;
    this.total_value = total_value;
  }

  public Integer getNumber() {
    return this.number;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public Double getTotalValue() {
    return this.total_value;
  }

  public List<Installment> getInstallments() {
    return this.installments;
  }

  public void showInstallments() {
    System.out.println("Parcelas: ");
    for (Installment installment : installments) {
      System.out.println(installment);
    }
  }

}
