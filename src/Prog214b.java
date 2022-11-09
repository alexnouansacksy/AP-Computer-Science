import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

// Alex Nouansacksy
// Prog214b
// 11/07/2022
public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog214b.dat"));

            Cl214b[] list = new Cl214b[1000];
            int cnt = 0;

            while (keyboard.hasNext()) {
                int ID = keyboard.nextInt();
                double ytd = keyboard.nextDouble();
                double rate = keyboard.nextDouble();
                double shiftCode = keyboard.nextDouble();
                double hours = keyboard.nextDouble();

                Cl214b wow = new Cl214b(ID, ytd, rate, shiftCode, hours);
                list[cnt] = wow;
                cnt += 5;
            }

            for (int lcv = 0; lcv < cnt; lcv += 5)
                list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv += 5)
                out.println(list[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
