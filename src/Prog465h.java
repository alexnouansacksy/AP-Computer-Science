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

                for(int row = 0; row < mat.length; row++) {
                    for (int col = 0; col < mat[0].length; col++) {
                        mat[row][col] = keyboard.nextInt();
                    }
                }

                out.println("Original Matrix");
                for (int[] row : mat) {
                    for (int num:row) out.print(num + "\t");
                    out.println();
                }

                int notZero = 0;

                for (int i = 0; i < cols; i++) {
                    if (mat[0][i] != 0) {
                        notZero++;
                    }
                }

                if (notZero < 3) {
                    ArrayList<Integer> nums = new ArrayList<>();

                    for (int i = 0; i < mat.length; i++) {
                        for (int j = 0; j < mat[0].length; j++) {
                            if (mat[i][j] != 0) {
                                nums.add(i + 1);
                                nums.add(j + 1);
                                nums.add(mat[i][j]);
                            }
                        }
                    }

                    int theRows = nums.size() /3;
                    int[][] display = new int[theRows] [3];
                    int cnt = 0;

                    for (int i = 0; i < display.length; i++) {
                        for (int j = 0; j < display[0].length; j++) {
                            display[i][j] = nums.get(cnt);
                            cnt++;
                        }
                    }

                    for (int[] row : display) {
                        for (int num:row) out.print(num + "\t");
                        out.println();
                    }

                    if(nums.size() == rows * cols) out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");
                    else out.println("The Original Matrix is Sparse");
                    out.println("");

                } else {
                    out.println("The Original Matrix is Abundant\n");

                }
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
 /*
 Original Matrix
0	0	7	0	0	0
0	0	0	0	-8	0
0	0	0	0	0	0
2	0	0	0	0	0
0	0	0	0	0	0
1	3	7
2	5	-8
4	1	2
The Original Matrix is Sparse

Original Matrix
0	2	0	3	0	1
8	0	4	0	1	0
0	3	0	1	0	-7
5	0	9	0	6	0
0	2	0	-1	0	7
The Original Matrix is Abundant

Original Matrix
0	0	1	0	0	2
3	0	0	4	0	0
0	0	5	0	0	6
7	0	0	8	0	0
0	0	9	0	0	1
1	3	1
1	6	2
2	1	3
2	4	4
3	3	5
3	6	6
4	1	7
4	4	8
5	3	9
5	6	1
The Original Matrix and the Sparse Matrix are Equally Efficient


Process finished with exit code 0

  */