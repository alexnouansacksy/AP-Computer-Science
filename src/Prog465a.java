import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

// Alex Nouansacksy
// Prog465a
// 01/05/2023
public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog465a.dat"));
            int[][] mat = new int[4][4]; // 4 rows, 4 columns
            int[][] mat2 = new int[4][4]; // 4 rows, 4 columns

            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = keyboard.nextInt();
                }
            }
            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat2[0].length; col++) {
                    mat2[row][col] = keyboard.nextInt();
                }
            }

            int[][] mat3 = new int[4][4]; // 4 rows, 4 columns
            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat3[0].length; col++) {
                    mat3[row][col] = Math.max(mat[row][col], mat2[row][col]);
                }
            }

            for (int[] row : mat) {
                for (int num:row) out.print(num + " ");
                out.println();
            }
            out.println();
            for (int[] row : mat2) {
                for (int num:row) out.print(num + " ");
                out.println();
            }
            out.println();
            for (int[] row : mat3) {
                for (int num:row) out.print(num + " ");
                out.println();
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1

4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1

4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1

Process finished with exit code 0

 */