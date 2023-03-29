import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int n = sc.nextInt();

    int[][] matrix = new int[n][n];

    sc.nextLine();
    for (int i = 0; i < n; i++) {
      String[] input = sc.nextLine().split((" "));
      int[] row = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
      matrix[i] = row;
    }

    System.out.println();
    String diagonal = "";
    int negativeNumbers = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (i == j) {
          diagonal += String.format("%d ", matrix[i][i]);
        }
        if (matrix[i][j] < 0) {
          negativeNumbers++;
        }
      }
    }

    System.out.println("Main diagonal:");
    System.out.println(diagonal);
    System.out.printf("Negative numbers = %d%n", negativeNumbers);

    sc.close();
  }
}