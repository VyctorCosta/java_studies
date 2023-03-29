package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PaypalService;

//15:43 -> 16:40 ~ 1 hr to resolve

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    PaypalService actual_service = new PaypalService();

    System.out.println("Entre os dados do contrato:");
    System.out.print("Numero: ");
    Integer number = sc.nextInt();
    System.out.print("Data (dd/MM/yyyy): ");
    sc.nextLine();
    LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
    System.out.print("Valor do contrato: ");
    Double total_value = sc.nextDouble();
    System.out.print("Entre com o numero de parcelas: ");
    Integer number_of_installments = sc.nextInt();

    final Contract contract = new Contract(number, date, total_value);
    final ContractService contractService = new ContractService(actual_service);

    contractService.processContract(contract, number_of_installments);

    contract.showInstallments();

    sc.close();
  }
}