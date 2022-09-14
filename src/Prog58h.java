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

       // double term1 = (.01 * r )/ n;
       // double power = (n * t)/365;
        // double amount = p * (1 + (Math.pow(term1, power)));
  
         double amount2 = p * Math.pow((1 + ((.01 * r) / n)), ((n * t) / 365));

        double interest = amount2 - p;
  
        System.out.printf("The interest earned is $%.2f", interest);
        System.out.printf("\n The total amount in savings is now $%.2f", amount2);
    }
  
} 
/*
Amount Saved:5000
Interest Rate: 11.5
Number of times compounded per year: 365
Number of days at interest: 900
The interest earned is $1638.96
The total amount in savings is now $6638.96
*/
