// Alex Nouansacksy
// LP3Exercise14Class
// 11/23/2022
import java.util.*;
import static java.lang.System.out;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    out.println("Election Results of New York: ");
    out.print("Awbrey: ");
    int awbreyNY = keyboard.nextInt();
    out.print("Martinez: ");
    int martinezNY = keyboard.nextInt();
    out.println("Election Results of New Jersey: ");
    out.print("Awbrey: ");
    int awbreyNJ = keyboard.nextInt();
    out.print("Marintez: ");
    int martinezNJ = keyboard.nextInt();
    out.println("Election Results of Connecticut: ");
    out.print("Awbrey: ");
    int awbreyCT = keyboard.nextInt();
    out.print("Martinez: ");
    int martinezCT = keyboard.nextInt();

    ClLP3Exercise14 wow = new ClLP3Exercise14 (awbreyNY, martinezNY, awbreyNJ, martinezNJ, awbreyCT, martinezCT);
    wow.setStuff();
    wow.print();
  }
}
/*
Election Results of New York:
Awbrey: 314159
Martinez: 271860
Election Results of New Jersey: 
Awbrey: 89008
Martinez: 121032
Election Results of Connecticut:
Awbrey: 213451
Martinez: 231034

Candidates    Votes   Percentage
Awbrey        616618  49.71
Martinez      623926  50.29
TOTAL VOTES:  1240544.00
*/
