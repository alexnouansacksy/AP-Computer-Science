import java.util.*;
// Alex Nouansacksy
// 9/15/22
// Prog93t

public class Prog93a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner((System.in));

        System.out.println("Enter Killowats Hours: ");
        double used = keyboard.nextDouble();
        double rate = 0.0475;
        double charge = used * rate;
        double surcharge = charge * 0.1;
        double tax = charge * 0.03;

        charge += 0.005;
        charge *= 100;
        charge = (int) charge;
        charge /= 100;

        surcharge += 0.005;
        surcharge *= 100;
        surcharge = (int) surcharge;
        surcharge /= 100;

        tax += 0.005;
        tax *= 100;
        tax = (int) tax;
        tax /= 100;

        double total = charge + surcharge + tax;
        double late = total * 1.04;

        late += 0.005;
        late *= 100;
        late = (int) late;
        late /= 100;

        System.out.print("\nC O M P S C I Electric");
        System.out.print("\n----------------------------------");
        System.out.print("\nKilowatts used: " + used);

        System.out.print("\n----------------------------------");
        System.out.print("\nBase Rate " + used + " @ $0.0475  $" + charge);
        System.out.print("\nSurcharge  $" + surcharge);
        System.out.print("\nCity Tax $" + tax);
        System.out.print("\n----------------------------------");
        System.out.print("\nPay this amount: $" + total);
        System.out.print("\nAfter May 20 pay: $" + late);
        
    }
}
/*
C O M P S C I Electric
----------------------------------
Kilowatts used: 993.0
----------------------------------
Base Rate 993.0 @ $0.0475  $47.17
Surcharge  $4.72
City Tax $1.42
----------------------------------
Pay this amount: $53.31
After May 20 pay: $55.44
Process finished with exit code 0
 */
