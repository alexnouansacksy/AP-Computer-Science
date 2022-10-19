// Alex Nouansacksy
// Prog54cClass
// 10/19/2022
import java.util.*;
import static java.lang.System.out;
public class Prog54cClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Radius: ");
        double radius = keyboard.nextDouble();

        Cl54c wow = new Cl54c(radius);
        wow.setStuff();
        double area = wow.getMyArea();
        double circumference = wow.getMyCircumference();

        out.printf("The Area of the Circle: %.3f\nThe Circumference of the Circle: %.3f\n", area, circumference);

    }
}
/*
Radius: 5
The Area of the Circle: 78.540
The Circumference of the Circle: 31.416

Process finished with exit code 0
 */