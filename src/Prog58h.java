import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Amount Saved: ");
        double p = keyboard.nextDouble();

        System.out.print("Interest Rate: ");
        double r = keyboard.nextDouble();

        System.out.print("Number of times compounded per year: ");
        double n = keyboard.nextDouble();

        System.out.print("Number of days at interest: ");
        double t = keyboard.nextDouble();

        double amount = p * (1 + (Math.pow(((.01 * r )/ n), (n * t)/365)));

        double interest = amount - p;
        System.out.println("The interest earned is: " + interest);
        System.out.println("The total amount in savings is now: " + amount);
    }
}
    