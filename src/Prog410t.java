import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;
// Alex Nouansacksy
// Prog410t
// 11/11/2022
public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog285b.dat"));

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
