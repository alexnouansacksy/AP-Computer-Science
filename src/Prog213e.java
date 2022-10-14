// Alex Nouansacksy
// 10/10/2022
// Prog213e
import java.util.*;
import java.io.*;
public class Prog213e {
    public static void main(String[] args) {
        double lessThan20 = 0;
        double lessThan20Distribution = 0;
        double lessThan40 = 0;
        double lessThan40Distribution = 0;
        double lessThan60 = 0;
        double lessThan60Distribution = 0;
        double lessThan80 = 0;
        double lessThan80Distribution = 0;
        double above80 = 0;
        double above80Distribution = 0;
        double total = 0;
        try {
            Scanner keyboard = new Scanner(new File("data/prog213e.dat"));
            while (keyboard.hasNext()) {
                double num = keyboard.nextDouble();
                //if (num > 79 ) above80Distribution++;
                if (num > 20 && num < 40) lessThan40Distribution++;
                else if (num > 39 && num < 60) lessThan60Distribution++;
                else if (num > 59 && num < 80) lessThan80Distribution++;
                else if (num > 79 ) above80Distribution++;
                else lessThan20Distribution++;
                total++;
            }
            lessThan20 = lessThan20Distribution/total;
            lessThan40 = lessThan40Distribution/total;
            lessThan60 = lessThan60Distribution/total;
            lessThan80 = lessThan80Distribution/total;
            above80 = above80Distribution/total;

            System.out.println("Langner Family");
            System.out.println("Age\tGroup\tDistribution\tPercentage");
            System.out.printf("<20\t\t\t%f\t\t%.2f\n", lessThan20Distribution, lessThan20);
            System.out.printf("20-39\t\t%f\t\t%.2f\n", lessThan40Distribution, lessThan40);
            System.out.printf("40-59\t\t%f\t\t%.2f\n", lessThan60Distribution, lessThan60);
            System.out.printf("60-79\t\t%f\t\t%.2f\n", lessThan80Distribution, lessThan80);
            System.out.printf("79\t\t\t%f\t\t%.2f\n ", above80Distribution, above80);

        } catch(IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Langner Family
Age	Group	Distribution	Percentage
<20			6.000000		0.26
20-39		4.000000		0.17
40-59		8.000000		0.35
60-79		3.000000		0.13
79			2.000000		0.09

Process finished with exit code 0
 */