// Alex Nouansacksy
// Prog152a Recursive
// 02/13/2023
import static java.lang.System.out;

public class Prog152aRecursive {
    public static int sum(int n) {
        if (n == 9669) return n;
        else return n + sum(n + 3);
    }
    public static void main(String[] args) {
        int sum = sum(0);
        out.println("The sum of the multiples of 3, from 3 to 9669 is " + sum);
    }
}
/*
The sum of the multiples of 3, from 3 to 9669 is 15586428
 */