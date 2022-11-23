// Alex Nouansacksy
// LP3Exercise10Class
// 11/16/2022
import java.util.*;
import static java.lang.System.out;
public class LP3Exercise10Class {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            out.print("Enter the number of burgers: ");
            int burgers = keyboard.nextInt();
            out.print("Enter the number of fries: ");
            int fries = keyboard.nextInt();
            out.print("Enter the number of sodas: ");
            int sodas = keyboard.nextInt();
            out.print("Cash Tendered: ");
            double tendered = keyboard.nextDouble();

            ClLP3Exercise10 wow = new ClLP3Exercise10(burgers, fries, sodas, tendered);

            wow.setStuff();
            wow.print();
    }
}

/*
PART A
Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Tax: $0.90
Total: $14.68

PART B
Enter the number of burgers: 2
Enter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Cash Tendered: $20
Tax: $0.90
Total: $14.68
Change: $5.32
*/
