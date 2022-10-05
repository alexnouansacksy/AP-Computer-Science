// Alex Nouansacksy
// 10/05/2022
// LP 5-17
import java.util.*;
public class LP5Exercise17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password = "alexnouansacksy";
        int lcv = 0;

        while (lcv < 3) {
            System.out.print("Enter the password: ");
            String guess = keyboard.nextLine();
            if (guess.equals(password)) {
                System.out.println("Welcome");
                break;
            } else {
                System.out.println("The password you entered is incorrect");

            }
            lcv++;
        }
        if (lcv == 3) System.out.println("Access Denied");
    }
}

/*
Enter the password: a
The password you entered is incorrect
Enter the password: a
The password you entered is incorrect
Enter the password: alexnouansacksy
Welcome
 */
