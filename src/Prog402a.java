import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

// Alex Nouansacksy
// Prog402a
// 11/10/2022
public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog285b.dat"));

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
