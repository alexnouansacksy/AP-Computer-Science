import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int row = 0; row < mat.length ; row++) {
                for (int column = 0; column < mat[row].length; column++) {
                    mat[row][column] = keyboard.nextInt();
                }
            }

            for (int[] row : mat) {
                for (int n : row) {
                    out.print(n + "\t");
                }
                out.println();
            }
            int diag1 = 0;
            int diag2 = 0;
            int cnt = 4;
            for (int i = 0; i < mat.length; i++) {
                diag1 += mat[i][i];
                diag2 += mat[i][cnt];
                cnt--;
            }
            out.println();
            out.println("Main Diagonal Sum " + diag1);
            out.println("Other Diagonal Sum " + diag2);
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
45	67	89	12	-3
-3	-6	-7	-4	-9
96	81	-8	52	12
14	-7	72	29	-1
19	43	28	63	87

Main Diagonal Sum 147
Other Diagonal Sum -3

Process finished with exit code 0

 */