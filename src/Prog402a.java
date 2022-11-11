import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

// Alex Nouansacksy
// Prog402a
// 11/10/2022
public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prg402a.dat"));
            Cl402a[] list = new Cl402a[1000];
            int cnt = 0;
            int total = 0;
            double difference = 0;
            double average = 0;
            int ID = 0;
            int score = 0;
            while (keyboard.hasNext()) {
                ID = keyboard.nextInt();
                score = keyboard.nextInt();

                Cl402a wow = new Cl402a(ID, score);
                list[cnt] = wow;
                cnt += 2;

                difference = wow.getMyDifference();
                average = wow.getMyAverage();

            }

            for (int lcv = 0; lcv < cnt; lcv += 2)
                list[lcv].calc();

            for (int lcv = 0; lcv < cnt; lcv += 2)
                ID = list[cnt]


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
