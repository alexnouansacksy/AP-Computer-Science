// Alex Nouansacksy
// 09/22/22
// Prog166f

public class Prog166f {
    public static void main(String[] args ) {
        double a = 100;
        double b = 0;

      while (a <= 110) {
        while (b <= a) {
          b++;
          b += b;
        }
      System.out.println("The sum of all the numbers 1 to " + a + " is " + b);
      b = 0;
      a ++;
      }

    }
}
