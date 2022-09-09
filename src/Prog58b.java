import java.util.*;

public class Prog58b {
    public static void main (String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter A: ");
    double A = keyboard.nextDouble();

    System.out.print("Enter B: ");
    double B = keyboard.nextDouble();

    System.out.print("Enter C: ");
    double C = keyboard.nextDouble();

    double root1 = ((-1 * B) + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / 2 * A;
    double root2 = ((-1 * B) - Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / 2 * A;

    System.out.print("The roots are: " + root1 + ", " + root2);
    }
}
/*
Enter A: 1
Enter B: 5
Enter C: 6
The roots are: -2.0, -3.0

Enter A: 1
Enter B: 1
Enter C: -2
The roots are: 1.0, -2.0

Enter A: 1
Enter B: 1
Enter C: -6
The roots are: 2.0, -3.0
 */
