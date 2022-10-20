// Alex Nouansacksy
// Prog76aClass
// 10/19/2022
import java.util.*;
import static java.lang.System.out;
public class Prog76aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter a number you dislike: ");
        int num = keyboard.nextInt();

        Cl76a wow = new Cl76a(num);
        wow.setStuff();
        int product1 = wow.getMyProduct1();
        int product2 = wow.getMyProduct2();

        out.print(num);
        out.print("\nx 9");
        out.print("\n---------");
        out.print("\n" + product1);
        out.print("\nx 12345679");
        out.print("\n---------\n");
        out.print(product2 + "  Surprise!");
    }
}
/*
Enter a number you dislike: 5
5
x 9
---------
45
x 12345679
---------
555555555  Surprise!
Process finished with exit code 0

 */