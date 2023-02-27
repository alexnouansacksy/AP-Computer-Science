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
            if (remainder > 9) {
                out.print((char) (60 + remainder - 5));
            } else {
                out.print(remainder);
            }
        }
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        out.print("Enter the number base 10 to convert: ");
        int num = keyboard.nextInt();
        out.print("Enter the new base: ");
        int base = keyboard.nextInt();
        while (num != -1) {
            out.print("The number " + num + " [base 10] = ");
            convertBase(num, base);
            out.print(" [base " + base + "]");
            out.print("\n\nEnter the number base 10 to convert: ");
            num = keyboard.nextInt();
            out.print("Enter the new base: ");
            base = keyboard.nextInt();
        }
    }
}
/*
Enter the number base 10 to convert: 255
Enter the new base: 16
The number 255 [base 10] = FF [base 16]

Enter the number base 10 to convert: 256
Enter the new base: 16
The number 256 [base 10] = 100 [base 16]

Enter the number base 10 to convert: 34
Enter the new base: 8
The number 34 [base 10] = 42 [base 8]

Enter the number base 10 to convert: 100
Enter the new base: 3
The number 100 [base 10] = 10201 [base 3]

Enter the number base 10 to convert: 1034
Enter the new base: 12
The number 1034 [base 10] = 722 [base 12]

Enter the number base 10 to convert: -1
Enter the new base: -1

Process finished with exit code 0

 */