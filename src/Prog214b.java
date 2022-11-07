import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Alex Nouansacksy
// Prog214b
// 11/07/2022
public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog214b.dat"));

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
