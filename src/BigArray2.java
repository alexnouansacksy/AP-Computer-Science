// Alex Nouansacksy
// Big Array Part II
// 11/16/2022
import java.io.*;
import java.util.*;
import static java.lang.System.out;
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
10.	What numbers are in the 50s?
11.	What numbers are multiples of 4?


 */
public class BigArray2 {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/bigarraylist.dat"));
            int numCats = keyboard.nextInt();
            keyboard.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = keyboard.nextLine();
                double weight = keyboard.nextDouble();
                int age = keyboard.nextInt();
                double cost = keyboard.nextDouble();
                keyboard.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
