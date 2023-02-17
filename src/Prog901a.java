// Alex Nouansacksy
// Prog901a
// 02/16/2023

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;


public class Prog901a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog512h.dat"));
            String phrase = "";
            while (keyboard.hasNext()) phrase = phrase + keyboard.next() + " ";
            out.print(phrase);
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
