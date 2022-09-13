import java.util.*;
// Alex Nouansacksy
// 9/13/22
// Prog58t

public class Prog58t {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter Purchase Price: $");
    double price = keyboard.nextDouble();

    System.out.print("Enter Amount Received: $");
    double received = keyboard.nextDouble();
    
    double changeDue = received - price;
    double totalChange = changeDue;

    double dollars = (((int)changeDue) * 100)/100 ;
    changeDue -= dollars;
    double quarters = (int) (changeDue / 0.25);
    changeDue -= (quarters * 0.25);
    double dimes = (int) (changeDue / 0.1);
    changeDue -= (dimes * 0.10);
    double nickels = (int) (changeDue / 0.05);
    changeDue -= (nickels * 0.05);
    double pennies = (int) (changeDue * 100);
   
    System.out.printf("\nChange due: $%.2f", totalChange );
    System.out.print("\n\nDollars: " + dollars);
    System.out.print("\nQuarters: " + quarters);
    System.out.print("\nDimes: " + dimes);
    System.out.print("\nNickels: " + nickels);
    System.out.print("\nPennies: " + pennies);
    
/*

Change due: $14.68

Dollars: 14.0
Quarters: 2.0
Dimes: 1.0
Nickels: 1.0
Pennies: 3.0

*/
  }
}
