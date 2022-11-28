// Alex Nouansacksy
// LP4Exercise8
// 11/28/2022
import java.util.*;
import static java.lang.System.out;
public class LP4Exercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("A: ");
        int a = keyboard.nextInt();
        out.print("C: ");
        int c = keyboard.nextInt();
        out.print("M: ");
        int m = keyboard.nextInt();
        out.print("X0 (seed): ");
        int x0 = keyboard.nextInt();
        ClLP4Exercise8 wow = new ClLP4Exercise8(a, c , m, x0);
        for (int lcv = 0; lcv < 10; lcv++) {
            wow.print();
            wow.nextInt();
        }
    }
}
/*
A: 1246
C: 200
M: 50
X0 (seed): 12

(1246 * 12 + 200) % 50 = 2
(1246 * 42 + 200) % 50 = 32
(1246 * 22 + 200) % 50 = 12
(1246 * 2 + 200) % 50 = 42
(1246 * 32 + 200) % 50 = 22
(1246 * 12 + 200) % 50 = 2
(1246 * 42 + 200) % 50 = 32
(1246 * 22 + 200) % 50 = 12
(1246 * 2 + 200) % 50 = 42
(1246 * 32 + 200) % 50 = 22

Process finished with exit code 0

 */
