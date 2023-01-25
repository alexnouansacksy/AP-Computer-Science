// Alex Nouansacksy
// Prog464d
// 01/23/2023
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog464d {
    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                transposed[col][row] = mat[row][col];
            }
        }
        return transposed;
    }


    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[5][5];

            // Read in matrix in Row-Major Order
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length;c++) {
                    mat[r][c]  = keyboard.nextInt();
                }
            }

            int[][] transposed = transpose(mat);

            out.println("Original matrix:");
            for (int[] row : mat) {
                for (int c : row) {
                    out.print(c + " ");
                }
                out.println();
            }

            out.println("\nTransposed matrix:");

            for (int row = 0; row < transposed.length; row++) {
                for (int col = 0; col < transposed[0].length; col++) {
                    out.print(transposed[row][col] + " ");
                }
                out.println();
            }
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Original matrix:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

Transposed matrix:
45 -3 96 14 19
67 -6 81 -7 43
89 -7 -8 72 28
12 -4 52 29 63
-3 -9 12 -1 87

Process finished with exit code 0

 */