// Alex Nouansacksy
// Prog213fClass
// 10/20/2022
import java.io.*;
import java.util.*;
import static java.lang.System.out;
public class Prog213fClass {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog213f.dat"));
            while (keyboard.hasNext()) {
                int hours = keyboard.nextInt();
                if (hours == -999) break;
                Cl213f wow = new Cl213f(hours);
                wow.setStuff();
                double cost = wow.getmyCost();
                out.printf("The cost of %d is $%.2f\n", hours, cost);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338 is $93.66
The cost of 9631 is $521.55
The cost of 13561 is $682.44

Process finished with exit code 0
 */
