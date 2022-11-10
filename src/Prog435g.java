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

            // Sort the scores via BUBBLE SORT
            for (int lcv = 0; lcv < count; lcv++) {
                for (int lcv2 = 0; lcv2 < count - 1; lcv2++) {
                    if(scores[lcv2] > scores[lcv2 + 1]) {
                        int temp = scores[lcv2];
                        scores[lcv2] = scores[lcv2 + 1];
                        scores[lcv2 + 1] = temp;
                    }
                }
            }

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
/*
Score	Rank
66		1
68		2
68		2
69		3
70		4
70		4
70		4
70		4
71		5
72		6
72		6
72		6
73		7
74		8
75		9
75		9
75		9
76		10
76		10
77		11
77		11
78		12
80		13
81		14
82		15
86		16
87		17
88		18
88		18
88		18
90		19

Process finished with exit code 0

 */