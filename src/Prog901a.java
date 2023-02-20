// Alex Nouansacksy
// Prog901a
// 02/16/2023

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;



public class Prog901a {
    public static String reverseString(String s) {
        return "";
    }

    public static void printFile(Scanner input) {

    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog512h.dat"));
            printFile(keyboard);
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
