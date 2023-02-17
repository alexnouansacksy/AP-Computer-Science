// Alex Nouansacksy
// Prog910b
// 02/17/2023

import java.util.*;
import static java.lang.System.out;

public class Prog910b {
    public static void convertBase(int num, int base) {
        if (num > 0) {
            int remainder = num % base;
            num = num / base;
            convertBase(num, base);
            out.print(remainder);
        }
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        out.print("Enter the number base 10 to convert: ");
        int num = keyboard.nextInt();
        out.print("Enter the new base: ");
        int base = keyboard.nextInt();
        while (num != -1) {
            convertBase(num, base);
            out.print("\nEnter the number base 10 to convert: ");
            num = keyboard.nextInt();
            out.print("Enter the new base: ");
            base = keyboard.nextInt();
        }
    }
}
