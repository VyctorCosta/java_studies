package entities;

import java.util.Scanner;

public class Matrix {
  private int[][] matrix;
  private Scanner sc = new Scanner(System.in);

  public Matrix(int x, int y) {
    this.matrix = new int[x][y];
  }

  public void startMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
  }

  public void findPositions(int num) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == num) {
          System.out.printf("Position %d,%d:%n", i, j);
          printNeighbors(i, j);
        }
      }
    }
  }

  private void printNeighbors(int i, int j) {
    if (j - 1 >= 0) {
      System.out.printf("Left: %d%n", matrix[i][j - 1]);
    }
    if (i - 1 >= 0) {
      System.out.printf("Up: %d%n", matrix[i - 1][j]);
    }
    if (j + 1 < matrix[0].length) {
      System.out.printf("Right: %d%n", matrix[i][j + 1]);
    }
    if (i + 1 < matrix.length) {
      System.out.printf("Down: %d%n", matrix[i + 1][j]);
    }
  }

}
