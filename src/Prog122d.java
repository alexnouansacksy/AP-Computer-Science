// Alex Nouansacksy
// Prog122d
// 09/20/22
public class Prog122d {
    public static void main(String[] args) {
        int lcv = -12;
        while (lcv <= 16) {
            double x = lcv;
            double y = Math.pow(x, 6) - (3 * Math.pow(x, 5)) - (93 * Math.pow(x, 4)) + (87 * Math.pow(x, 3)) +
                    (1596 * Math.pow(x, 2) - (1380 * x) - 2800);
            System.out.println(x + "     " + y);
            lcv++;

        }
    }
}
/*
-12.0     1897280.0
-11.0     982800.0
-10.0     453600.0
-9.0     173888.0
-8.0     45360.0
-7.0     0.0
-6.0     -6400.0
-5.0     0.0
-4.0     6048.0
-3.0     7280.0
-2.0     4320.0
-1.0     0.0
0.0     -2800.0
1.0     -2592.0
2.0     0.0
3.0     2240.0
4.0     0.0
5.0     -10800.0
6.0     -32032.0
7.0     -60480.0
8.0     -84240.0
9.0     -78400.0
10.0     0.0
11.0     217728.0
12.0     671840.0
13.0     1496880.0
14.0     2872800.0
15.0     5033600.0
16.0     8276688.0

Process finished with exit code 0

 */