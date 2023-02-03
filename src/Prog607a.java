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
                int firstDay;
                if (second == 79) {
                     firstDay = 0;
                } else {
                     firstDay = second - 80;
                }
                int secondDay;
                if (third == 79) {
                    secondDay = 0;
                } else {
                    secondDay = third - 80;
                }
                int year;
                year = 1970 + (27 - (fourth - 64));


                out.print("The date is: " + month + "/" + firstDay + "" + secondDay + "/" + year + "\n");

            }

            out.print("\n---menu----\n0) Quit\n1) Encode Date\n2) Decode Date\nSelect an option: ");
            num = keyboard.nextInt();
        }


    }

}
/*
---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 1
Enter month: 9
Enter day: 14
Enter year: 83
The code is: IQTN

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 1
Enter month: 1
Enter day: 14
Enter year: 84
The code is: AQTM

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter code: IQTN
The date is: 9/14/1983

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter code: AOQV
The date is: 1/01/1975

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 1
Enter month: 1
Enter day: 1
Enter year: 75
The code is: AOQV

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter code: KORH
The date is: 11/02/1989

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 2
Enter code: AQTM
The date is: 1/14/1984

---menu----
0) Quit
1) Encode Date
2) Decode Date
Select an option: 0

Process finished with exit code 0

 */