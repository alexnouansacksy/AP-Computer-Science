// Alex Nouansacksy
// 9/29/22
// LP 4-10
import java.util.*;
public class LP4Exercise10 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        int prismLength = keyboard.nextInt();
        System.out.print("Enter the width: ");
        int prismWidth = keyboard.nextInt();
        System.out.print("Enter the height: ");
        int prismHeight = keyboard.nextInt();
        int prismVolume = prismHeight * prismWidth * prismLength;
        System.out.println("The volume is: " + prismVolume);
        System.out.println("");

        System.out.println("Sphere");
        System.out.print("Enter the radius: ");
        double radius = keyboard.nextDouble();
        double sphereVolume = ((3.14159 * Math.pow((radius * 2), 3)))/ (double)6;
        System.out.println("The volume is: " + sphereVolume);
        System.out.println("");

        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        int cubeLength = keyboard.nextInt();
        double cubeVolume = Math.pow(cubeLength, 3);
        System.out.println("The volume is " + cubeVolume);

    }

}
/*
Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
The volume is: 60

Sphere
Enter the radius: 3
The volume is: 113.09724

Cube
Enter the length of each side: 4
The volume is 64.0

Process finished with exit code 0

 */
