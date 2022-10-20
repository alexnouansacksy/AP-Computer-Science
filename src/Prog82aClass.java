// Alex Nouansacksy
// Prog82aClass
// 10/20/2022
import java.util.*;
import static java.lang.System.out;
public class Prog82aClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Enter the speed limit: ");
        int limit = keyboard.nextInt();
        out.print("Enter the vehicle speed: ");
        int speed = keyboard.nextInt();

        Cl82a wow = new Cl82a(limit, speed);
        wow.setStuff();

        int fine = wow.getMyFine();
        out.println("Fine: $" + fine);

    }
}
/*
Enter the speed limit: 55
Enter the vehicle speed: 70
Fine: $95

Process finished with exit code 0
 */