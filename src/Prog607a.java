// Alex Nouansacksy
// Prog607a
// 02/02/2023
import java.util.*;
import static java.lang.System.out;
public class Prog607a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num = -1;


        out.print("\n---menu----\n0) Quit\n1) Encode Date\n2) Decode Date\nSelect an option: ");
        num = keyboard.nextInt();

        while (num != 0) {
            if (num == 1) {
                out.print("Enter month: ");
                int month = keyboard.nextInt();
                out.print("Enter day: ");
                int day = keyboard.nextInt();
                out.print("Enter year: ");
                int year = keyboard.nextInt();

                String code = "";

                code = code + (char) (64 + month);
                if (day / 10 < 1) code = code + "O";
                else code = code + (char) (80 + (day / 10));
                code = code + (char) (80 + (day % 10));
                code = code + (char) (64 + (27 - (year - 70)));


                out.println("The code is: " + code);
            } else if (num == 2) {
                out.print("Enter code: ");
                String code = keyboard.next();
                char first = code.charAt(0);
                char second = code.charAt(1);
                char third = code.charAt(2);
                char fourth = code.charAt(3);

                int month = first - 64;
                if (second == 70) {
                    int firstDay = 0;
                } else {
                    int firstDay = 80;
                }


                out.print(month);

            }

            out.print("\n---menu----\n0) Quit\n1) Encode Date\n2) Decode Date\nSelect an option: ");
            num = keyboard.nextInt();
        }


    }

}
