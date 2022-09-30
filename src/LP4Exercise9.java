// Alex Nouansacksy
// 9/29/22
// LP 4-9
import java.util.*;
public class test {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * (20 -1) + 1);
        // Tested out the program by making the random number between 1-5, and it should work
        // with numbers 1-20 since it worked with smaller numbers
        System.out.print("Enter a number 1-20: ");
        int playerNumber = keyboard.nextInt();
        System.out.println("Computer's Number: " + secretNumber);
        System.out.println("Player's Number: " + playerNumber);
        if (secretNumber == playerNumber) System.out.println("You win!");
        else System.out.println("Better luck next time!");
    }
}
/*
Enter a number 1-20: 4
Computer's Number: 4
Player's Number: 4
You win!
 */
