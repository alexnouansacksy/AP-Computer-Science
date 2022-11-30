// Alex Nouansacksy
// Prog410t
// 11/11/2022
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/survey2.dat"));
            int data[] = new int[45];
            int cnt = 0;
            int familiescnt = 0;
            while (keyboard.hasNext()) {
                data[cnt] = keyboard.nextInt();
                cnt++;
                if (cnt % 3 == 0) familiescnt ++;
            }

            int ids[] = new int[15];
            int incomes[] = new int[15];
            int members[] = new int[15];

            int cnt2 = 0;
            for (int lcv = 0; lcv < data.length; lcv += 3) {
                ids[cnt2] = data[lcv];
                incomes[cnt2] = data[lcv + 1];
                members[cnt2] = data[lcv + 2];
                cnt2++;
            }


            for (int i = 0; i < ids.length; i++ ) {
                if (ids[i] != 0) out.println(ids[i] + "\t" + incomes[i] + "\t" + members[i]);
            }

            double averageIncome = 0;
            int totalIncome = 0;

            for (int i = 0; i < incomes.length; i++) {
                totalIncome += incomes[i];
            }
            averageIncome = totalIncome / (double) familiescnt;
            out.printf("the average income is %.1f\n", averageIncome);

            int[] indexesofincomesbelowaverage = new int[15];

            int cnt3 = 0;
            for (int i = 0; i < incomes.length; i++) {
                if (incomes[i] > averageIncome)  {
                    indexesofincomesbelowaverage[cnt3] = i;
                    cnt3++;
                }
            }

            for (int i = 0; i < indexesofincomesbelowaverage . length; i++) {
                if (indexesofincomesbelowaverage[i] != 0) {
                    out.println(ids[indexesofincomesbelowaverage[i]] + "\t " + incomes[indexesofincomesbelowaverage[i]]
                     + "\t" + members[indexesofincomesbelowaverage[i]]);
                }
            }

            double familiesInPoverty = 0;

            for (int lcv = 0; lcv <familiescnt; lcv++) {
                if (incomes[lcv] < (3750 + (750 * (members[lcv] - 2)))) familiesInPoverty++;
            }
            double percentInPoverty;
            percentInPoverty = familiesInPoverty / familiescnt;
            out.printf("Percent of households below the poverty level: %.7f\n", percentInPoverty);


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
