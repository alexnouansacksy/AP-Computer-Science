import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Alex Nouansacksy
// Prog213fArray
// 11/08/2022
public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog213f.dat"));

            Cl213f[] list = new Cl213f[1000];
            int cnt = 0;

            while (keyboard.hasNext()) {
                int hours = keyboard.nextInt();
                if (hours == -999) break;
                Cl213f wow = new Cl213f(hours);
                list[cnt] = wow;
                cnt ++;
            }

            for (int lcv = 0; lcv < cnt; lcv++) list[lcv].setStuff();
            for (int lcv = 0; lcv < cnt; lcv++) System.out.println(list[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338 hours is $93.66
The cost of 9631 hours is $521.55
The cost of 13561 hours is $682.44

Process finished with exit code 0
 */