package AbstClLab;
import java.util.*;
import static java.lang.System.out;

public class AbstClLab {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Circle
        out.print("Enter circle radius: ");
        double radius = keyboard.nextDouble();
        // Rectangle
        Shape sh1 = new Circle(radius);
        out.print("Enter height: ");
        double rheight = keyboard.nextDouble();
        out.print("Enter width: ");
        double rwidth = keyboard.nextDouble();
        Shape sh2 = new Rectangle(rheight, rwidth);
        // Triangle
        out.print("Enter triangle base: ");
        double tbase = keyboard.nextDouble();
        out.print("Enter triangle height: ");
        double thheight = keyboard.nextDouble();
        Shape sh3 = new Triangle(thheight, tbase);

        ((Circle) sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();
        ((Rectangle) sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();
        ((Triangle) sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();


    }
}
/*
Enter circle radius: 3.5
Enter height: 5
Enter width: 10
Enter triangle base: 30
Enter triangle height: 50
class AbstClLab.Circle
Area: 38.48
Circumference 21.99
class AbstClLab.Rectangle
Area: 50.0
Perimeter: 30.0
class AbstClLab.Triangle
Area 750.0
Perimeter 138.309518948453

Process finished with exit code 0

 */