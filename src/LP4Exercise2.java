// Alex Nouansacksy
// 9/29/22
// LP 4-2
import java.util.*;
public class LP4Exercise2 {
    public static void main(String[] args) {
        int weight = 0;
        int length = 0;
        int width = 0;
        int height = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the weight in kilograms: ");
        weight = keyboard.nextInt();
        System.out.print("Enter the length in centimeters: ");
        length = keyboard.nextInt();
        System.out.print("Enter the width in centimeters: ");
        width = keyboard.nextInt();
        System.out.print("Enter the height in centimeters ");
        height = keyboard.nextInt();

        int area = length * width * height;
        if (area > 100000 && weight > 27) System.out.println("Too large and too heavy.");
        else if (area > 100000) System.out.println("Too large.");
        else if (weight > 27) System.out.println("Too heavy.");


    }
}
/*
Enter the weight in kilograms: 32
Enter the length in centimeters: 10
Enter the width in centimeters: 25
Enter the height in centimeters 38
Too heavy.
 */
