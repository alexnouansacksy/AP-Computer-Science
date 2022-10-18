// Alex Nouansacksy
// Prog54bClass
// 10/18/2022
import java.util.*;
import static java.lang.System.out;


public class Prog54bClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("First Number: ");
        int num1 = keyboard.nextInt();
        out.print("Second Number: ");
        int num2 = keyboard.nextInt();
        out.print("Third Number: ");
        int num3 = keyboard.nextInt();
        out.print("Fourth Number: ");
        int num4 = keyboard.nextInt();

        Cl54b wow = new Cl54b(num1, num2, num3, num4);
        wow.setStuff();
        int sum = wow.getMySum();
        double average = wow.getMyAverage();
        out.println("Sum: " + sum);
        out.println("Average: " + average);


    }
}
/*
First Number: 475
Second Number: 821
Third Number: 369
Fourth Number: 562
Sum: 2227
Average: 556.75

Process finished with exit code 0
 */