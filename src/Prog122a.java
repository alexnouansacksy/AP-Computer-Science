// Alex Nouansacksy
// 9/19/22
// Prog122a
public class Prog122a {
    public static void main(String[] args) {
        System.out.println("Number" + "     " + "Square" + "     " + "Square Root");
        int lcv = 0;
        while (lcv < 50) {
            lcv += 1;
            int number = lcv;
            int square = lcv * lcv;
            double squareroot = Math.sqrt(number);
            System.out.printf(number +   "          " + square + "         " + String.format("%.4f", squareroot));
            System.out.println("");
        }

    }
}
/*
Number     Square     Square Root
1          1         1.0000
2          4         1.4142
3          9         1.7321
4          16         2.0000
5          25         2.2361
6          36         2.4495
7          49         2.6458
8          64         2.8284
9          81         3.0000
10          100         3.1623
11          121         3.3166
12          144         3.4641
13          169         3.6056
14          196         3.7417
15          225         3.8730
16          256         4.0000
17          289         4.1231
18          324         4.2426
19          361         4.3589
20          400         4.4721
21          441         4.5826
22          484         4.6904
23          529         4.7958
24          576         4.8990
25          625         5.0000
26          676         5.0990
27          729         5.1962
28          784         5.2915
29          841         5.3852
30          900         5.4772
31          961         5.5678
32          1024         5.6569
33          1089         5.7446
34          1156         5.8310
35          1225         5.9161
36          1296         6.0000
37          1369         6.0828
38          1444         6.1644
39          1521         6.2450
40          1600         6.3246
41          1681         6.4031
42          1764         6.4807
43          1849         6.5574
44          1936         6.6332
45          2025         6.7082
46          2116         6.7823
47          2209         6.8557
48          2304         6.9282
49          2401         7.0000
50          2500         7.0711

Process finished with exit code 0

 */