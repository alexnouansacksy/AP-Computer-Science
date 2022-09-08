import java.util.*;

public class Prog52Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int length = input.nextInt();
        System.out.println();

        System.out.print("Please enter the width: ");
        int width = input.nextInt();
        System.out.println();

        int area = length * width;
        int perim = 2 * length + 2 * width;

        System.out.println("Area: " + area);
        System.out.println("Perim: " + perim);
    }
}
/*Please enter the length: 12

Please enter the width: 12

Area: 144
Perim: 48

 */