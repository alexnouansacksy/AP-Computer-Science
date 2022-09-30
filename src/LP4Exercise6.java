// Alex Nouansacksy
// 9/29/22
// LP 4-6
import java.util.*;
public class LP4Exercise6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1 = (int) (Math.random() * (10 -1) + 1);
        int num2 = (int) (Math.random() * (10 -1) + 1);
        int operator = (int) (Math.random() * (4 - 1) + 1);
        double answer = 0;
        if (operator == 1) {
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            answer = num1 + num2;
        }
        if (operator == 2) {
            System.out.print("What is " + num1 + " - " + num2 + "? ");
            answer = num1 - num2;
        }
        if (operator == 3) {
            System.out.print("What is " + num1 + " * " + num2 + "? ");
            answer = num1 * num2;
        }
        if (operator == 4) {
            System.out.print("What is " + num1 + " / " + num2 + "? ");
            answer = (double)num1 / num2;
        }
        double studentAnswer = keyboard.nextDouble();
        if (studentAnswer == answer) System.out.println("Correct!");
        else System.out.println("Incorrect! The correct answer was " + answer);
    }


}
/*
What is 6 / 4? 0.3
Incorrect! The correct answer was 1.5
 */
