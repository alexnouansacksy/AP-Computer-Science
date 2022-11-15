// Alex Nouansacksy
// BigArray
// 11/15/2022
import static java.lang.System.out;
public class BigArray {
    /*
 1.	Print the ArrayList from the beginning to the end
 2.	Print the ArrayList from the beginning to the end using a for-each loop
 3.	What number is in the middle of the ArrayList?
 4.	What is the average of the first, last and middle numbers?
 5.	Find the smallest and the largest number in the ArrayList
 6.	Switch the largest with smallest number. Print the list
 7.	Create a new random from 1 to 10 and insert it in the middle slot. Print the numbers.
 8.	Add 10 to every number in the List. Print all.
 9.	Replace the 3rd element in the array with 5 and print the number that was ousted (only use one method to complete this.)
 10. What numbers are in the 50s?
 11. What numbers are multiples of 4?
*/
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++){
            array[lcv] = (int) (Math.random() * (91 - 20) + 20);
        }

        //  1.	Print the ArrayList from the beginning to the end
        for (int lcv = 0; lcv < array.length; lcv++) {
            out.print(array[lcv] + " ");
        }
        out.println();

        //  2.	Print the ArrayList from the beginning to the end using a for-each loop
        for (int temp : array) {
            out.print(temp + " ");
        }
        out.println();

        //  3.	What number is in the middle of the ArrayList?
        out.println("Middle number is " + array[array.length/2]);

        //  4.	What is the average of the first, last and middle numbers?
        double avg = array[0] + array[array.length - 1] + array[array.length/2];
        out.println("Average of the first, last, and middle numbers is " + avg);

        //  5.	Find the smallest and the largest number in the ArrayList
        int smallest = array[0];
        int biggest = array[0];
        for (int temp : array) {
            if (temp < smallest) smallest = temp;
            if (temp > biggest) biggest = temp;
        }
        out.println("Smallest number is : " + smallest);
        out.println("Biggest number is : " + biggest);

        //  6.	Switch the largest with smallest number. Print the list
        for (int lcv = 0; lcv < array.length; lcv++) {
            if(array[lcv] == smallest) array[lcv] = biggest;
            else if (array[lcv] == biggest) array[lcv] = smallest;
        }

        for (int x : array) out.print(x + " ");
        out.println();

        //  7.	Create a new random from 1 to 10 and insert it in the middle slot. Print the numbers.
        int randNum = (int) (Math.random() * 10 + 1);
        array[array.length / 2] = randNum;

        for (int x : array) out.print(x + " ");
        out.println();

        //  8.	Add 10 to every number in the List. Print all.
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;
        }

        for (int x : array) out.print(x + " ");
        out.println();

        //  9.	Replace the 3rd element in the array with 5 and print the number that was ousted (only use one method to complete this.)
        int myThird = array[2];
        array[2] = 5;
        out.println("Number that was ousted was " + myThird);

        //  10. What numbers are in the 50s?
        for (int num : array) {
            if (num >= 50 && num < 60) {
                out.print(num + " ");
            }
        }
        out.println();

        //   11. What numbers are multiples of 4?
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] % 4 == 0) {
                out.print(array[lcv] + " ");
            }
        }
        out.println();


    }


}
