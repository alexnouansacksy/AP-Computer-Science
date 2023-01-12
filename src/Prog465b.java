// Alex Nouansacksy
// Prog465b
// 01/12/2023
import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;


public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog465b.dat"));
            int rows = 3;
            int columns = 4;

            int[][] mat = new int[rows][columns];

            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = keyboard.nextInt();
                }
            }

            ArrayList<Integer> second = new ArrayList<>();

            for(int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    if (mat[row][col] < 100) {
                        second.add(row + 1);
                        second.add(col + 1);
                    }
                }
            }

            out.println("Original Table");
            for (int[] row : mat) {
                for (int num:row) out.print(num + "\t");
                out.println();
            }

            out.println("\nNumbers Less Than 100");
            out.println("Rows\tColumn");
            for (int i = 0; i < second.size(); i++) {
                out.print(second.get(i) + "\t\t" + second.get(i + 1));
                out.println();
                i++;
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Original Table
100	195	182	225
83	125	235	67
129	42	100	750

Numbers Less Than 100
Rows	Column
2		1
2		4
3		2

Process finished with exit code 0

 */