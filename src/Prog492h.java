// Alex Nouansacksy
// Prog492h
// 01/23/2023

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog492h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog492hnum.dat"));

            int rows = keyboard.nextInt();
            int cols = keyboard.nextInt();
            int[][] mat = new int[rows][cols];

            for (int i = 0; i < mat.length; i ++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = keyboard.nextInt();
                }
            }

            for (int[] row : mat) {
                for (int n : row) {
                    if(n == 1) out.print("*");
                    else out.print(" ");
                }
                out.println();
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
