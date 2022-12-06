import java.io.File;
import java.io.IOException;
import java.util.*;


import static java.lang.System.out;

// Alex Nouansacksy
// Prog215h
// 12/05/2022
public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog215h.txt"));
            ArrayList<Double> wow = new ArrayList<Double>();
            int cnt = 0;
            while (keyboard.hasNext()) {
                wow.add(keyboard.nextDouble());
            }
            int participants = wow.size() / 3;
            for (int lcv = 0; lcv <= participants; lcv += 8) {
                cnt++;
                double num1 = wow.get(lcv);
                double num2 = wow.get(lcv + 1);
                double num3 = wow.get(lcv + 2);
                double num4 = wow.get(lcv + 3);
                double num5 = wow.get(lcv + 4);
                double num6 = wow.get(lcv + 5);
                double num7 = wow.get(lcv + 6);
                double num8 = wow.get(lcv + 7);

                Cl215h alex = new Cl215h(num1, num2, num3, num4, num5, num6, num7, num8);
                alex.setStuff();
                out.printf("Contestant %d\n %.1f %.1f %.1f %.1f %.1f %.1f %.1f %.1f = %.2f\n", cnt, num1, num2, num3, num4, num5, num6,
                        num7, num8, alex.getAverage());
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Contestant 1
 8.4 9.1 8.5 8.4 9.1 8.7 8.8 9.1 = 8.76
Contestant 2
 7.0 7.0 7.0 7.0 7.0 7.0 7.0 7.0 = 7.00
Contestant 3
 8.0 7.9 8.0 8.0 8.0 8.0 8.0 8.1 = 8.00
 */