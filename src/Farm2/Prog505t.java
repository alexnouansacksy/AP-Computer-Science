package Farm2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog505t.dat"));

            int myNumHayBales = keyboard.nextInt();


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
