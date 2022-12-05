import java.io.File;
import java.io.IOException;
import java.util.*;


import static java.lang.System.out;

// Alex Nouansacksy
// Prog215h
// 12/05/2022
public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog215h.dat"));
            ArrayList<Double> wow = new ArrayList<Double>();
            int cnt = 0;
            while (keyboard.hasNext()) {
                //wow[cnt] = keyboard.nextDouble();

            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
