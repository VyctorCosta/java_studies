import java.util.Random;

public class MegaSena {

  public static void main(String[] args) {
    Random generator = new Random();

    for (int i = 0; i < 6; i++) {
      System.out.println(generator.nextInt(60));
    }

    final String x = "10";
    final String y = "10";

    System.out.println(x == y);
  }

}
