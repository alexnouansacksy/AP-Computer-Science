// Alex Nouansacksy
// 10/05/22
// LP 5-5
import java.util.*;
public class LP5Exercise6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = keyboard.nextInt();
        int lcv = 0;
        int total = 0;
        String theNumber = number + "";
        while (lcv < theNumber.length()) {
            String character = theNumber.substring(lcv, lcv + 1);
            total += Integer.valueOf(character);
            lcv++;
        }
        System.out.println("The sum of the digits is: " + total);
    }
}
/*
Enter a positive integer: 892
The sum of the digits is: 19

Process finished with exit code 0
 */