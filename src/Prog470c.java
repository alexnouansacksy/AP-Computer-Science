// Alex Nouansacksy
// Prog470c
// 01/05/2022
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog470c {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog464a.dat"));

            int[][] mat = new int[6][6]; // 6x6 matrix
            for (int row = 0; row < mat.length -1; row++) {
                for (int column = 0; column < mat[row].length -1; column++) {
                    mat[row][column] = keyboard.nextInt();
                }
            }

            for (int row = 0; row < mat.length-1; row++) {
                for (int column = 0; column < mat[0].length - 1; column++) {
                    out.print(mat[row][column] + " ");
                }
                out.println();
            }
            out.println();

            for (int row = 0; row < mat.length - 1; row++) {
                for (int column = 0; column < mat[row].length - 1; column++) {
                    mat[row][5] += mat[row][column];
                    mat[5][column] += mat[row][column];
                    mat[5][5] += mat[row][column];
                }
            }

            for (int[] row : mat) {
                for (int n : row) {
                    out.print(n + "\t");
                }
                out.println();
            }
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}

/*
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

45	67	89	12	-3	210
-3	-6	-7	-4	-9	-29
96	81	-8	52	12	233
14	-7	72	29	-1	107
19	43	28	63	87	240
171	178	174	152	86	761

Process finished with exit code 0

 */
