package entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rent {

  private LocalDateTime pickup_time;
  private LocalDateTime return_time;
  private Double price_per_hour;
  private Double price_per_day;
  private Double payment;
  private Double tax;

  public Rent(LocalDateTime pickup_time, LocalDateTime return_time, Double price_per_hour, Double price_per_day) {
    this.pickup_time = pickup_time;
    this.return_time = return_time;
    this.price_per_hour = price_per_hour;
    this.price_per_day = price_per_day;
  }

  public Double getBasicPayment() {
    if (payment != null) {
      return payment;
    }

    Duration lease_duration = Duration.between(pickup_time, return_time);
    if (lease_duration.toHours() < 12) {
      payment = price_per_hour * (lease_duration.toHours() + (lease_duration.toMinutes() > 0 ? 1 : 0));
      return payment;
    }

    payment = price_per_day * (lease_duration.toDays() + (lease_duration.toHours() > 0 ? 1 : 0));
    return payment;
  }

  public Double getTax() {
    if (tax != null) {
      return tax;
    }

    Double payment = getBasicPayment();
    if (payment < 100) {
      tax = payment * 0.2;
      return tax;
    }

    tax = payment * 0.15;
    return tax;
  }

  public Double getTotalPayment() {
    return getBasicPayment() + getTax();
  }
}