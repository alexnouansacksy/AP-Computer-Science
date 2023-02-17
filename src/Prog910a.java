// Alex Nouansacksy
// Prog910a
// 02/14/2023
import java.util.Scanner;
import static java.lang.System.out;

public class Prog910a {
    public static String decToBinary(int num) {
        if (num == 0) return "0";
        if (num == 1) return "1";
        return decToBinary(num/2) + num % 2;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter the number to be converted: ");
        int num = keyboard.nextInt();
        while (num != -1) {
            out.println(decToBinary(num));
            out.print("\nEnter the number to be converted: ");
            num = keyboard.nextInt();
        }
    }
}
/*
Enter the number to be converted: 32767
111111111111111

Enter the number to be converted: 25
11001

Enter the number to be converted: 359
101100111

Enter the number to be converted: 256
100000000

Enter the number to be converted: -1

Process finished with exit code 0

 */