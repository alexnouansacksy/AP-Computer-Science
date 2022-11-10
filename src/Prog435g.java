import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

// Alex Nouansacksy
// Prog435g
// 11/10/2022
public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog435g.dat"));
            int[] scores = new int[100];
            int count = 0;

            while(keyboard.hasNext()) {
                scores[count] = keyboard.nextInt();
                count++;
            }

            // Sort the scores

            Cl435g[] golfers = new Cl435g[count];
            for (int lcv = 0; lcv < count; lcv++) {
                golfers[lcv] = new Cl435g((scores[lcv]));
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++) {
                golfers[lcv].setRank(rank);
                if (lcv < count - 1 && scores[lcv] != scores[lcv + 1]) rank++;
            }

            out.println("Score\tRank");
            for (int lcv = 0; lcv < count; lcv++) out.println(golfers[lcv].toString());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
