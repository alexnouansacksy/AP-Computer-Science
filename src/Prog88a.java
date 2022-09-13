//Alex Nouansacksy
//9/12/2022
//Prog88a

public class Prog88a {
    public static void main(String[] args) {
        //Enter Number 1-13
        //Enter Number 2-20
        //Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13 -1)) + 1;
        int num2 = (int)(Math.random() * (20-2)) + 2;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = ((double) num1 + (double) num2) / 2;
        int absolutevalue = Math.abs(difference);

        int max;
        int min;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max == num1) { //check if max and num1 are the same value
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute Value = " + absolutevalue);
        System.out.println("Maximum= " + max);
        System.out.println("Minimum= " + min);
    }
}
/*
Original numbers are 10 and 3
Sum = 13
Difference = 7
Product = 30
Average = 6.5
Absolute Value = 7
Maximum= 10
Minimum= 3
 */
