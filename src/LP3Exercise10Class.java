// Alex Nouansacksy
// LP3Exercise10Class
// 11/16/2022
import java.util.*;
import static java.lang.System.out;
public class LP3Exercise10Class {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            out.print("Enter the number of burgers: ");
            int burgers = keyboard.nextInt();
            out.print("Enter the number of fries: ");
            int fries = keyboard.nextInt();
            out.print("Enter the number of sodas: ");
            int sodas = keyboard.nextInt();

            ClLP3Exercise10 wow = new ClLP3Exercise10(burgers, fries, sodas);

    }
}
