import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import static java.lang.System.out;

// Alex Nouansacksy
// Prog 465h
// 01/12/2023
public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog465h.dat"));
            while (keyboard.hasNext()) {
                int rows = keyboard.nextInt();
                int cols = keyboard.nextInt();
                int[][] mat = new int[rows][cols];

                int notZero = 0;
                for (int i = 0; i < cols - 1; i++) {
                    if (mat[0][i] != 1) {
                        notZero++;
                    }
                }
                if (notZero >= 3) {
                    out.println("The Origial Matrix is Abundant");
                    return;
                }

                ArrayList<Integer> nums = new ArrayList<>();

                for (int i = 0; i < cols - 1; i++) {
                    for (int j = 0; j < rows - 1; j++) {
                        if (mat[i][j] != 0) {
                            nums.add(i + 1);
                            nums.add(j + 1);
                            nums.add(mat[i][j]);
                        }
                    }
                }

                int rows2;


            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
