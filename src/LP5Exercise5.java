// Alex Nouansacksy
// 10/05/22
// LP 5-5
import java.util.*;
public class LP5Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = keyboard.nextInt();
        int lcv = 0;
        String theNumber = number + "";
        while (lcv < theNumber.length()) {
            String character = theNumber.substring(lcv, lcv + 1);
            System.out.println(character);
            lcv++;
        }
    }
}
/*
Enter a positive integer: 546
5
4
6

Process finished with exit code 0
 */