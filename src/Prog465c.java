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
            int rows = keyboard.nextInt();
            int columns = keyboard.nextInt();

            int[][] mat = new int[rows][columns];

            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = keyboard.nextInt();
                }
            }

            for (int[] row : mat) {
                for (int num:row) out.print(num + "\t");
                out.println();
            }

            int tot = 0;
            for (int i = 0; i < columns; i++) {
                tot += mat[0][i];
                tot += mat[rows - 1][i];
            }
            for (int i = 1; i < rows - 1; i++) {
                tot += mat[i][0];
                tot += mat[i][columns - 1];
            }
            out.println("The total of the edges is " + tot);

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
100	195	182	225
83	125	235	67
129	42	100	750
The total of the edges is 1873

Process finished with exit code 0

 */