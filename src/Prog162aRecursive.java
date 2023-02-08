// Alex Nouansacksy
// Prog162a Recursive
// 02/08/2023

import java.util.Scanner;
import static java.lang.System.out;

public class Prog162aRecursive {
    public static int factorial(int n) {
        if (n == 1) return n; // Base/ending Case
        else return n * factorial(n - 1); // Recursive Case
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter a number: ");
        int num = keyboard.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            out.println(fact);
            out.print("Enter a number: ");
            num = keyboard.nextInt();

        }
    }
}
