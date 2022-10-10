// Alex Nouansacksy
// 10/10/2022
// Prog209a
import java.util.*;
import java.io.*;

public class Prog209a {
    public static void main(String[] args) {
    double lessthan500 = 0;
    double greaterthanequal500 = 0;
    double totNums = 0;
    try {
        Scanner keyboard = new Scanner(new File("data/prog215a.dat"));
        while (keyboard.hasNext()) {
            double num = keyboard.nextDouble();
            if (num < 500) lessthan500++;
            else greaterthanequal500++;
            totNums++;
        }
        System.out.println("The number of numbers less than 500 is " + lessthan500);
        System.out.println("The number of numbers greater than or equal to 500 is " + greaterthanequal500);
        System.out.println("The total number of numbers is " + totNums);
    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }

    }
}
/*
The number of numbers less than 500 is 192.0
The number of numbers greater than or equal to 500 is 208.0
The total number of numbers is 400.0

Process finished with exit code 0
 */