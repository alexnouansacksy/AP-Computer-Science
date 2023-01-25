// Alex Nouansacksy
// Prog492h
// 01/23/2023

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog492h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog492h.dat"));

            String[][] mat = new String[31][30];

            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = keyboard.next();
                }
            }

            for (String[] row : mat) {
                for (String c : row) {
                    out.print(c + " ");
                }
                out.println();
            }
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
