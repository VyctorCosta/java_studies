package services;

import entities.Contract;
import entities.Installment;

public class ContractService {
  private OnlinePaymentService service;

  public ContractService(OnlinePaymentService service) {
    this.service = service;
  }

  public void processContract(Contract contract, Integer months) {
    for (int i = 1; i <= months; i++) {
      Double month_amount = contract.getTotalValue() / months;
      Double interest_amount = month_amount + service.interest(month_amount, i);
      Double installment_amount = interest_amount + service.paymentFee(interest_amount);
      Installment installment = new Installment(contract.getDate().plusMonths(i), installment_amount);
      contract.getInstallments().add(installment);
    }
  }
}