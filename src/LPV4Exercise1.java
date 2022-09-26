// Alex Nouansacksy
// 09/26/22
// LPV 4-1
import java.util.*;

public class LPV4Exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter how many copies: ");
        double copies = keyboard.nextDouble();
        double pricePerCopies = 0;
        if (copies <= 99) pricePerCopies = 0.30;
        else if (copies <= 499) pricePerCopies = 0.28;
        else if (copies <= 749) pricePerCopies = 0.27;
        else if (copies <= 1000) pricePerCopies = 0.26;
        else pricePerCopies = 0.25;
        double total = copies * pricePerCopies;
        System.out.println("Total cost is: $" + total);


    }
}
/*
Enter how many copies: 1001
Total cost is: $250.25
*/