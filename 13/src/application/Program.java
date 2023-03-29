package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

  public static void main(String[] args) {
    final String dir = System.getProperty("user.dir");
    final boolean created = new File(dir + "/out").mkdir();
    final List<Employee> personList = new ArrayList<>();

    if (created) {
      System.out.println("out folder created!");
    }

    try (BufferedReader br = new BufferedReader(new FileReader(dir + "/src/persons.csv"))) {
      String line = br.readLine();
      String[] fields;

      while (line != null) {
        fields = line.split(",");
        personList.add(new Employee(fields[0], Double.parseDouble(fields[1])));
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    Collections.sort(personList);

    System.out.println(dir);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(dir +
        "/out/ordered_persons.csv"))) {
      for (Employee person : personList) {
        bw.write(person.getName() + ",");
        bw.write(person.getSalary().toString());
        bw.newLine();
      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }

}