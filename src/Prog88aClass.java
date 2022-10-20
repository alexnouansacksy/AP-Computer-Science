// Alex Nouansacksy
// Prog88aClass
// 10/20/2022
import java.util.*;
import static java.lang.System.out;
public class Prog88aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter a number 1-13: ");
        int num1 = keyboard.nextInt();
        out.print("Enter a number 2-20: ");
        int num2 = keyboard.nextInt();

        Cl88a wow = new Cl88a(num1, num2);
        wow.setStuff();

        int sum = wow.getMySum();
        int difference = wow.getMyDifference();
        int product = wow.getMyProduct();
        double average = wow.getMyAverage();
        int absoluteValue = wow.getMyAbsoluteValue();
        int max = wow.getMyMax();
        int min = wow.getMyMin();

        out.printf("Sum = %d\nDifference =%d\nProduct = %d\nAverage = %.1f\nAbsolute Value = %d\nMaximum = %d\nMinimum = %d",
                sum, difference, product, average, absoluteValue, max, min);
    }
}
/*
Enter a number 1-13: 13
Enter a number 2-20: 20
Sum = 33
Difference =-7
Product = 260
Average = 16.5
Absolute Value = 7
Maximum = 20
Minimum = 13
Process finished with exit code 0

 */
