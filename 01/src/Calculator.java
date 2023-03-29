public class Calculator {

  public static void main(String[] args) {
    final int x = Integer.parseInt(args[1]);
    final int y = Integer.parseInt(args[2]);
    final String exp = args[0];

    if (exp.equals("sum")) {
      System.out.println(sum(x, y));
    } else if (exp.equals("sub")) {
      System.out.println(sub(x, y));
    } else if (exp.equals("mult")) {
      System.out.println(mult(x, y));
    } else if (exp.equals("div")) {
      System.out.println(div(x, y));
    } else {
      System.out.println("Invalid Expression.");
    }
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int sub(int x, int y) {
    return x - y;
  }

  public static int mult(int x, int y) {
    return x * y;
  }

  public static double div(double x, double y) {
    return x / y;
  }

}
