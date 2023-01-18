// Alex Nouansacksy
// Prog477a
// 01/18/2023
import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;


public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog477a.dat"));
            int[][] wow = new int[6][3];
            int row = 0;
            int col = 0;
            while (keyboard.hasNext()) {
                int gender = keyboard.nextInt();
                int grade = keyboard.nextInt();
                if (gender == 1) col = 0;
                else col = 1;
                if (grade == 1) row = 0;
                else if (grade == 2) row = 1;
                else if (grade == 3) row = 2;
                else if (grade == 4) row = 3;
                else row = 4;

                int number = wow[row][col];
                number++;
                wow[row][col] = number;
            }

            for (int therow = 0; therow < wow.length - 1; therow++) {
                for (int thecol = 0; thecol < wow[therow].length - 1; thecol++) {
                    wow[therow][2] += wow[therow][thecol];
                    wow[5][thecol] += wow[therow][thecol];
                    wow[5][2] = wow[5][0] + wow[5][1];
                }
            }
            //out.println("Grade\tMale\tFemale\tTotal\nA\nB\nC\nD\nF\nTotals");

            for (int[] rows : wow) {
                out.print("A\t");
                for (int n : rows) {
                    out.print(n + "\t");
                }
                out.println();
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
