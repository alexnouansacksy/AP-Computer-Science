import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;
// Alex Nouansacksy
// Prog214c with ArrayLists
// 12/01/2022

public class Prog214cArrayList {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog214c.dat"));

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
