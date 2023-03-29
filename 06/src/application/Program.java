package application;

import java.util.Scanner;

import entities.Matrix;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x, y;
    x = sc.nextInt();
    y = sc.nextInt();
    Matrix matrix = new Matrix(x, y);

    matrix.startMatrix();

    final int num = sc.nextInt();
    matrix.findPositions(num);

    sc.close();
  }

}