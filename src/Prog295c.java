// Alex Nouansacksy
// Prog 295c
// 02/24/2023

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/merge1.dat"));
            Scanner keyboard2 = new Scanner(new File("data/merge2.dat"));

            ArrayList<String> list = new ArrayList<>();

            while (keyboard.hasNext()) list.add(keyboard.next());
            while (keyboard2.hasNext()) list.add(keyboard2.next());

            for (String a : list) {
                out.println(a);
            }

            for (int i = 0; i < list.size(); i ++) {
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
