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
 12. Is there a 60 in the list?
 13. Check to see if all of the elements from front to back are in the same order from back to front
 14. How many numbers are greater than the average?
 15. How many of the numbers are even?
 16. Copy all of the elements of the array into a new array but in reverse order
 17. Write a program to shift every element of an array circularly right. E.g.-INPUT : 1 2 3 4 5 OUTPUT : 5 1 2 3 4
 18. Find the sum of all of the digits of all of the elements

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

        //   12. Is there a 60 in the list?
        boolean sixty = false;
        for (int temp : array) {
            if (temp == 60)
                sixty = true;
        }
        out.println("Is 60 in the list? " + sixty);

        //  13. Check to see if all of the elements from front to back are in the same order from back to front
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++ ) {
            if(array[lcv] != array[array.length - 1 - lcv]) same = false;
        }
        out.println("Is the array plaindromic? " + same);

        //  14. How many numbers are greater than the average?
        double average = 0;
        for (int x : array) average += x;
        average /= array.length;

        int count = 0;
        for (int x : array)
            if (x > average) count++;
        out.printf("There are %d numbers great that the average\n", count);

        //  15. How many of the numbers are even?
        int evens = 0;
        for (int num : array) if(num % 2 == 0) evens++;
        out.printf("There are %d even numnbers\n", evens);

        // 16. Copy all of the elements of the array into a new array but in reverse order
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[lcv] = array[array.length - 1 - lcv];
        }

        for (int n: array2) out.print(n + " ");
        out.println();

        // 17. Write a program to shift every element of an array circularly right. E.g.-INPUT : 1 2 3 4 5 OUTPUT : 5 1 2 3 4
        int[] shiftArray = circularShiftRight(array);
        for (int num : shiftArray) out.print(num + " ");
        out.println();

        // 18. Find the sum of all of the digits of all of the elements
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        out.println("Sum of all digits of all elements = " + sum);

    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 0; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv];

        for (int lcv = 0; lcv < shifted.length - 1; lcv ++) {
            shifted [lcv + 1] = arr[lcv];
        }
        shifted[0] = temp;
        return shifted;
    }
}
