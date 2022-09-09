import java.util.*;

public class Prog54c {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double PI = 3.14159;

        System.out.print("Radius: ");
        double radius = keyboard.nextDouble();

        double area = Math.pow(radius, 2) * PI;
        double circumference = 2 * PI * radius;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

}
/*
Radius: 3.712
Area: 43.28779268096
Circumference: 23.32316416
 */