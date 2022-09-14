// Alex Nouansacksy
// 09/14/2022
// Prog65h

import java.util.Scanner;

public class Prog65h {
    public static void main (String[] args) {
        // £
        Scanner keyboard = new Scanner((System.in));

        System.out.print("Enter pounds: ");
        double pounds = keyboard.nextDouble();

        System.out.print("Enter shillings: ");
        double shillings = keyboard.nextDouble();

        System.out.print("Enter pence: ");
        double pence = keyboard.nextDouble();

        double total = pounds + (shillings / 20 + pence /12 / 20);

        System.out.printf("Decimal pounds =" + total + " pounds");

    }
}
/*Enter pounds: 7
  Enter shillings: 17
  Enter pence: 9
  Demical pounds =7.8875 pounds*/
