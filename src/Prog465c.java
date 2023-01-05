// Alex Nouansacksy
// Prog465c
// 01/05/2023
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog465c.txt"));
            Scanner input = new Scanner(System.in);
            out.print("Rows: ");
            int rows = input.nextInt();
            out.print("Columns: ");
            int columns = input.nextInt();

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
