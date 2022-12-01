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

            out.println("id\t\tincome\tmembers");
            for (int i = 0; i < ids.length; i++ ) {
                if (ids[i] != 0) out.println(ids[i] + "\t" + incomes[i] + "\t" + members[i]);
            }

            double averageIncome = 0;
            int totalIncome = 0;

            for (int i = 0; i < incomes.length; i++) {
                totalIncome += incomes[i];
            }
            averageIncome = totalIncome / (double) familiescnt;
            out.printf("\nHouses with an income above an average income of $%.1f\n", averageIncome);
            out.println("id\t\tincome\tmembers");

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
            }

            double povertyPercentage = 0;

            for (int lcv = 0; lcv < incomes.length; lcv ++) {
                Cl410t wow = new Cl410t(incomes[lcv], familiescnt, members[lcv]);
                wow.getPovertyPercentage();
                povertyPercentage = wow.getThePovertyPercentage();
            }
            out.printf("\nPercent of households below the poverty level: %.7f", povertyPercentage);

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
id		income	members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1

Houses with an income above an average income of $12707.4
id		income	members
1062	 13240	3
1327	 19800	2
1483	 22458	8
1900	 17000	2
2112	 18125	7
2345	 15623	2

Percent of households below the poverty level: 0.0769231
Process finished with exit code 0

 */