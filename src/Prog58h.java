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

        double amount = p * (1 + (Math.pow(((n * t)/365), ((.01 * r )/ n))));

        double interest = amount - p;
        System.out.printf("The interest earned is $%.2f", interest);
        System.out.printf("\n The total amount in savings is now $%.2f", amount);
    }
}
    