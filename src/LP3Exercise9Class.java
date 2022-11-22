// Alex Nouansacksy
// LP3Exercise9Class
// 11/16/2022
import static java.lang.System.out;
import java.util.*;
public class LP3Exercise9Class {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter Your Birthdate: ");
        out.print("Year: ");
        int birthYear = keyboard.nextInt();
        out.print("Month: ");
        int birthMonth = keyboard.nextInt();
        out.print("Day: ");
        int birthDay = keyboard.nextInt();;
        out.println("Enter Today's Date: ");
        out.print("Year: ");
        int currentYear = keyboard.nextInt();
        out.print("Month: ");
        int currentMonth = keyboard.nextInt();
        out.print("Day: ");
        int currentDay = keyboard.nextInt();

        ClLP3Exercise9 wow = new ClLP3Exercise9(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay);
        wow.setStuff();
        wow.print();

    }
}
/*
Enter Your Birthdate:
Year: 1997
Month: 2
Day: 12
Enter Today's Date:
Year: 2012
Month: 08
Day: 03
You have been alive for 5646 days.
You have slept for 45168 hours

Process finished with exit code 0

 */