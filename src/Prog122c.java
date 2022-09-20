// Alex Nouansacksy
// 9/19/22
// Prog122c

public class Prog122c {
    public static void main(String[] args) {
        int lcv = 0;
        while (lcv < 10) {
            lcv += 2;
            double term2 = lcv + 1;
            double term3 = lcv * 2;
            double term4 = lcv * lcv;
            System.out.println(lcv + "     " + term2 + "     " + term3 + "     " + term4);

        }
    }
}
/* 2     3.0     4.0     4.0
4     5.0     8.0     16.0
6     7.0     12.0     36.0
8     9.0     16.0     64.0
10     11.0     20.0     100.0

Process finished with exit code 0
*/