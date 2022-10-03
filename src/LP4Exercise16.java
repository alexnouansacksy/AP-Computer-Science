// Alex Nouansacksy
// 10/03/2022
import java.lang.Math.*;
import java.util.*;
public class LP4Exercise16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double degrees = keyboard.nextDouble();
        double radians = Math.toRadians(degrees);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        System.out.printf("Sine: %.3f\n", sine);
        System.out.printf("Cosine: %.3f\n", cosine);
        System.out.printf("Tangent: %.3f\n", tangent);

    }
}
/*
Enter an angle in degrees: 30
Sine: 0.500
Cosine: 0.866
Tangent: 0.577
 */