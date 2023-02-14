// Alex Nouansacksy
// Prog910a
// 02/24/2023
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
