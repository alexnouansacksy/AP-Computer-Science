// Alex Nouansacksy
// Prog152a Recursive
// 02/13/2023
import static java.lang.System.out;

public class Prog152aRecursive {
  public static int sum(int n, int max) {
        if (n == max) return n;
        else return n + sum(n + 3, max);
  }
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
  
    System.out.print("Starting Number: ");
    int n = keyboard.nextInt();
    System.out.print("Ending Number: ");
    int end = keyboard.nextInt();

    
    int sum = sum(0, 9669);
    out.println("The sum of the multiples of 3, from " + n +  " to " + end + " is " + sum);
  }
}

/*
Starting Number: 0
Ending Number: 9669
The sum of the multiples of 3, from 3 to 9669 is 15586428
 */
