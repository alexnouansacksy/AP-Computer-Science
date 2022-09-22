// Alex Nouansacksy
// 09/22/22
// Prog122h
public class Prog122h {
    public static void main(String[] args) {
        int lcv = 0;
        System.out.println("Number\t\tSquare\t\tSqrt\tCube\t\tFourth Root");
        while (lcv < 20) {
            lcv++;
            double number = lcv;
            double square = number * number;
            double squareroot = Math.sqrt(number);
            double cube = square *  number;
            double fourthroot = Math.pow(number, 0.25);
            System.out.printf("%f\t%f\t%.4f\t%f\t%.4f\n", number, square, squareroot, cube, fourthroot);
            //System.out.println(number + "    " + square + "     " + "     " + squareroot + "    " + cube + "    " + fourthroot);
        }
    }
}
/*
Number		Square		Sqrt	Cube		Fourth Root
1.000000	1.000000	1.0000	1.000000	1.0000
2.000000	4.000000	1.4142	8.000000	1.1892
3.000000	9.000000	1.7321	27.000000	1.3161
4.000000	16.000000	2.0000	64.000000	1.4142
5.000000	25.000000	2.2361	125.000000	1.4953
6.000000	36.000000	2.4495	216.000000	1.5651
7.000000	49.000000	2.6458	343.000000	1.6266
8.000000	64.000000	2.8284	512.000000	1.6818
9.000000	81.000000	3.0000	729.000000	1.7321
10.000000	100.000000	3.1623	1000.000000	1.7783
11.000000	121.000000	3.3166	1331.000000	1.8212
12.000000	144.000000	3.4641	1728.000000	1.8612
13.000000	169.000000	3.6056	2197.000000	1.8988
14.000000	196.000000	3.7417	2744.000000	1.9343
15.000000	225.000000	3.8730	3375.000000	1.9680
16.000000	256.000000	4.0000	4096.000000	2.0000
17.000000	289.000000	4.1231	4913.000000	2.0305
18.000000	324.000000	4.2426	5832.000000	2.0598
19.000000	361.000000	4.3589	6859.000000	2.0878
20.000000	400.000000	4.4721	8000.000000	2.1147

Process finished with exit code 0

 */