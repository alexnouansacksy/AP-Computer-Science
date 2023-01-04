// Alex Nouansacksy
// Prog464a
// 01/04/2023
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog464a {public static void main(String[] args) {
    try {
        Scanner keyboard = new Scanner(new File("data/prog464a.dat"));

        // 5 arrays with a length of 6;
        int[][] mat = new int[5][6]; // 5 rows, 6 columns
        for(int row = 0; row < mat.length; row++) { // 5 rows
            for (int col = 0; col < mat[0].length - 1; col++) { // 6 in each row
                mat[row][col] = keyboard.nextInt();
            }
        }

        // find biggest in each row and set last column to that number
        for (int r = 0; r < mat.length; r++) {
            int rowbig = Integer.MIN_VALUE;
            for (int c = 0; c < mat[0].length - 1; c++) {
                if (mat[r][c] > rowbig) rowbig = mat[r][c];
            }
            mat[r][5] = rowbig;
        }
        for (int[] row : mat) {
            for (int num:row) out.print(num + " ");
            out.println();
        }
    } catch (IOException e) {
        out.println("Can't find data file!");
    }
}
}
/*
45 67 89 12 -3 89
-3 -6 -7 -4 -9 -3
96 81 -8 52 12 96
14 -7 72 29 -1 72
19 43 28 63 87 87

Process finished with exit code 0
 */