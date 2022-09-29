// Alex Nouansacksy
// 9/29/22
// LP 4-3
import java.util.*;
public class LP4Exercise3 {
    public static void main(String[] args) {
        double perDozen = 0;
        System.out.print("Enter the number of eggs purchased: ");
        Scanner keyboard = new Scanner(System.in);
        int eggs = keyboard.nextInt();
        int dozens = ((int)eggs / 12);
        int leftover = eggs - (dozens * 12);

        if (dozens < 4) perDozen = 0.50;
        else if (dozens < 6) perDozen = 0.45;
        else if (dozens < 11) perDozen = 0.4;
        else perDozen = 0.35;

        double cost = (double) dozens * perDozen;
        double leftoverCost = (double) leftover * (perDozen * ((double)1/12));
        cost += leftoverCost;
        System.out.printf("The bill is equal to $%.2f", cost);
    }

}
/*
Enter the number of eggs purchased: 18
The bill is equal to $0.75
 */
