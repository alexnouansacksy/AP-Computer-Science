// Alex Nouansacksy
// MSOE2016_3
// 11/15/2022
import java.util.*;
import static java.lang.System.out;
public class MSOE2016_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("n: ");
        double n = keyboard.nextDouble();
        out.print("d: ");
        double d = keyboard.nextDouble();
        out.print("r1: ");
        double r1 = keyboard.nextDouble();
        out.print("r2: ");
        double r2 = keyboard.nextDouble();

        double value = (n - 1) * ((1/r1) - (1/r2) + (((n-1) * d)/(n * r1 * r2)));

        double f = 0;
        f = 1 / value;

        out.println("f = " + f);
    }
}
/*
no idea what the numbers would be in real life but the code should work
n: 0.1
d: 0.2
r1: 0.3
r2: 0.4
f = 0.07843137254901959
Process finished with exit code 0
 */
