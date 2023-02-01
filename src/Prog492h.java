// Alex Nouansacksy
// Prog492h
// 01/23/2023

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog492h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog492hnum.dat"));

            int rows = keyboard.nextInt();
            int cols = keyboard.nextInt();
            int[][] mat = new int[rows][cols];

            for (int i = 0; i < mat.length; i ++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = keyboard.nextInt();
                }
            }

            int[][] temp = new int[rows][cols];

            for (int row = 0; row < mat.length; row ++) {
                for (int col = 0; col < mat[0].length; col++) {
                    temp[row][col] = mat[row][col];
                }
            }


            for (int i = 0; i <= 15; i++) {
                out.println("Generation " + i);

                for (int[] row : mat) {
                    for (int n : row) {
                        if(n == 1) out.print("*");
                        else out.print(" ");
                    }
                    out.println();
                }

                int neighbors = 0;

                for (int row = 0; row < rows ; row ++) {
                    for (int col = 0; col < cols ; col++) {
                        if (row - 1 >= 0 && col - 1 >= 0 && row + 1 < rows && col + 1 < cols) {
                            if (mat[row - 1][col - 1] == 1) neighbors++;
                            if (mat[row - 1][col] == 1) neighbors++;
                            if (mat[row - 1][col + 1] == 1) neighbors++;
                            if (mat[row][col - 1] == 1) neighbors++;
                            if (mat[row][col + 1] == 1) neighbors++;
                            if (mat[row + 1][col - 1] == 1) neighbors++;
                            if (mat[row + 1][col] == 1) neighbors++;
                            if (mat[row + 1][col + 1] == 1) neighbors++;

                            if (neighbors == 3 && mat[row][col] == 0) {
                                temp[row][col] = 1;
                            } else if (neighbors >= 4 && mat[row][col] == 1) {
                                temp[row][col] = 0;
                            } else if (neighbors < 1 && mat[row][col] == 1) {
                                temp[row][col] = 0;
                            }
                        }

                    }
                }





                for (int row = 0; row < mat.length; row ++) {
                    for (int col = 0; col < mat[0].length; col++) {
                        mat[row][col] = temp[row][col];
                    }
                }


            }




        } catch (IOException e) {
            out.println("Can't find data file!");
        }


    }
}
