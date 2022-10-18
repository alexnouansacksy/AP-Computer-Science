// Alex Nouansacksy
// Prog52aClass
// 10/17/2022
import java.util.*;
import static java.lang.System.out;

public class Prog52aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Scanner() is the constructor

        out.print("Please enter the length: ");
        int length = keyboard.nextInt();
        printer.print("Please enter the width: ");
        int width = keyboard.nextInt();
        out.println();

        // Make a new object (instance) of Cl52a (instantiate the class)
        Cl52a wow = new Cl52a(length, width);
        wow.setStuff();

        int area = wow.getArea();
        int perimeter = wow.getPerim();

        printer.println("Area: " + area);
        out.println("Perimeter: " + perimeter);
    }
}
/*
Please enter the length: 12
Please enter the width: 12

Area: 144
Perimeter: 48

Process finished with exit code 0
 */