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
                double num = keyboard.nextDouble();
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
