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

             for (int i = 0; i < mat.length; i++) {
                 for (int j = 0; j < mat[0].length; j++) {
                     mat[i][j] = keyboard.nextInt();
                 }
             }

             int[][] temp = new int[rows][cols];

             for (int row = 0; row < mat.length; row++) {
                 for (int col = 0; col < mat[0].length; col++) {
                     temp[row][col] = mat[row][col];
                 }
             }


             for (int i = 0; i <= 15; i++) {
                 out.println("Generation " + i);

                 for (int[] row : mat) {
                     for (int n : row) {
                         if (n == 1) out.print("*");
                         else out.print(" ");
                     }
                     out.println();
                 }


                 for (int row = 0; row < mat.length; row++) {
                     for (int col = 0; col < mat[0].length; col++) {

                         int neighbors = 0;

                         int temprow = 0;
                         int tempcol = 0;

                         temprow = row - 1; // top left
                         tempcol = col - 1;

                         if (temprow >= 0 && tempcol >= 0) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row - 1; // top left
                         tempcol = col; // top
                         if (temprow >= 0) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row - 1; // top left
                         tempcol = col + 1; // top right
                         if (temprow >= 0 && tempcol < mat[0].length) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row; // left
                         tempcol = col - 1;
                         if (tempcol >= 0) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row;
                         tempcol = col + 1; // right
                         if (tempcol < mat[0].length) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row + 1; // bot left
                         tempcol = col - 1;
                         if (temprow < mat.length && tempcol >= 0) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row + 1;
                         tempcol = col; // bot mid
                         if (temprow < mat.length) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         temprow = row + 1;
                         tempcol = col + 1; // bot right
                         if (temprow < mat.length && tempcol < mat[0].length) {
                             if (mat[temprow][tempcol] == 1) neighbors++;
                         }

                         if (mat[row][col] == 1) {
                             if (neighbors >= 4 || neighbors <= 1) temp[row][col] = 0;
                         }
                         if (mat[row][col] == 0 && neighbors == 3) temp[row][col] = 1;

                     }
                 }

                 for (int row = 0; row < mat.length; row++) {
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
/*
Generation 0













            *    *
          ** **** **
            *    *














Generation 1













           ********
           * **** *
           ********














Generation 2












            ******
           *      *
          *        *
           *      *
            ******













Generation 3











             ****
            ******
           ********
          **      **
           ********
            ******
             ****












Generation 4










              **
            *    *
           *      *
          *        *
          *        *
          *        *
           *      *
            *    *
              **











Generation 5












           *      *
          **      **
         ***      ***
          **      **
           *      *













Generation 6












          **      **
         *  *    *  *
         *  *    *  *
         *  *    *  *
          **      **













Generation 7












          **      **
         *  *    *  *
        ******  ******
         *  *    *  *
          **      **













Generation 8












          **      **
        *    *  *    *
        *    *  *    *
        *    *  *    *
          **      **













Generation 9













         *  *    *  *
       ***  ******  ***
         *  *    *  *














Generation 10













         *  * ** *  *
         **** ** ****
         *  * ** *  *














Generation 11













         *  * ** *  *
        **  *    *  **
         *  * ** *  *














Generation 12













        **   *  *   **
        *****    *****
        **   *  *   **














Generation 13













        *  **    **  *
       *   ***  ***   *
        *  **    **  *














Generation 14













           * *  * *
       ** *  *  *  * **
           * *  * *














Generation 15













            *    *
          ** **** **
            *    *















Process finished with exit code 0

 */