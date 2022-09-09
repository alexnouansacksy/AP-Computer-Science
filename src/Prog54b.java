import java.util.*;

public class Prog54b {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First Number: ");
        double firstNumber = keyboard.nextDouble();

        System.out.print("Second Number: ");
        double secondNumber = keyboard.nextDouble();

        System.out.print("Third Number: ");
        double thirdNumber = keyboard.nextDouble();

        System.out.print("Fourth Number: ");
        double fourthNumber = keyboard.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        double average = sum / 4;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is : " + average);
    }
}
/*
        First Number: 475
        Second Number: 821
        Third Number: 369
        Fourth Number: 562
        The sum of the numbers is: 2227.0
        The average of the numbers is : 556.75

 */
