// Alex Nouansacksy
// 10/05/2022
// LP 5-9
public class LP5Exercise9 {
    public static void main(String[] args) {
        System.out.println("x^1\tx^2\tx^3\tx^4\tx^5");
        int lcv = 0;
        while (lcv < 6) {
            lcv++;
            double square = Math.pow(lcv, 2);
            double cube = Math.pow(lcv, 3);
            double fourthPower = Math.pow(lcv, 4);
            double fifthPower = Math.pow(lcv, 5);
            System.out.println(lcv + " " + square + " " + cube + " " + fourthPower + " " + fifthPower);
        }
    }
}
/*
x^1	x^2	x^3	x^4	x^5
1 1.0 1.0 1.0 1.0
2 4.0 8.0 16.0 32.0
3 9.0 27.0 81.0 243.0
4 16.0 64.0 256.0 1024.0
5 25.0 125.0 625.0 3125.0
6 36.0 216.0 1296.0 7776.0

Process finished with exit code 0

 */