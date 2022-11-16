// Alex Nouansacksy
// MSOE2016_2
// 11/15/2022
import java.util.*;
import static java.lang.System.out;
public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Side A: ");
        double sideA = keyboard.nextDouble();
        out.print("Side C: ");
        double sideC = keyboard.nextDouble();
        out.print("Angle A: ");
        double angleA = keyboard.nextDouble();

        double sinA = 0;
        sinA = Math.sin(Math.toRadians(angleA));
        double firstEquation = 0;
        firstEquation = sinA / sideA;

        double sinC = 0;
        sinC = firstEquation * sideC;

        double angleC = 0;
        angleC = Math.asin(sinC);

        out.println("Using the law of Sines, angle C is " + angleC);

        double possibleSecondSolution = 0;
        if (angleC + angleA < 180) {
            possibleSecondSolution = 180 - angleC;
            out.println("Second Solution: " + possibleSecondSolution);
        }

    }
}
/*
Side A: 12
Side C: 5
Angle A: 2
Using the law of Sines, angle C is 0.01454196948294754
Second Solution: 179.98545803051707

Process finished with exit code 0

 */
