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
            int cnt2 = 0;
            double total = 0;
            double average = 0;

            while (keyboard.hasNext()) {
                int ID = keyboard.nextInt();
                int score = keyboard.nextInt();
                total += score;
                Cl402a wow = new Cl402a(ID, score);
                list[cnt] = wow;
                cnt += 2;
                cnt2 ++;
            }

            average = total / cnt2;

            for (int lcv = 0; lcv < cnt; lcv+= 2) {
                list[lcv].calc(average);
            }

            out.println("ID\t\tScore\tDifference");
            for (int lcv = 0; lcv < cnt; lcv += 2)
                out.println(list[lcv].toString());
            out.printf("\nAverage Score: %.2f", average);

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
ID		Score	Difference
115		257		14.38
123		253		10.38
116		246		3.38
113		243		0.38
112		239		-3.62
104		239		-3.62
110		238		-4.62
218		243		0.38
208		242		-0.62
222		223		-19.62
223		230		-12.62
213		229		-13.62
207		228		-14.62
203		224		-18.62
305		265		22.38
306		262		19.38
311		256		13.38
325		246		3.38
321		245		2.38
323		245		2.38
301		242		-0.62

Average Score: 242.62
Process finished with exit code 0

 */
