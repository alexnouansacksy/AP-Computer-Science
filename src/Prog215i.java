// Alex Nouansacksy
// Prog215i
// 12/06/2022
import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.out;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog215i.txt"));
            ArrayList<Cl215i> list = new ArrayList<Cl215i>();

            while (keyboard.hasNext()) {

                int vehicle = keyboard.nextInt();
                double gallons = keyboard.nextDouble();
                double miles = keyboard.nextDouble();
                if (gallons != 0 && miles != 0) {
                    Cl215i wow = new Cl215i(vehicle, gallons, miles);
                    list.add(wow);
                }

                for (int lcv = 0; lcv < list.size(); lcv++) {
                    Cl215i current = list.get(lcv);
                    current.setStuff();
                }

            }
            out.println("Vehicle\tMiles\tGallons\tMPG");
            double bestMPG = 0;
            int vehicleWithBestMPG = 0;
            double worstMPG = 100;
            int vehicleWithWorstMPG = 0;
            double totalMPG = 0;
            for (Cl215i me: list) {
                if (me.getGallons() < 10) {
                    out.printf("%d\t%.1f\t%.1f\t\t%.1f\n", me.getVehicleNum(), me.getMiles(), me.getGallons(), me.getMPG());
                } else {
                    out.printf("%d\t%.1f\t%.1f\t%.1f\n", me.getVehicleNum(), me.getMiles(), me.getGallons(), me.getMPG());
                }
                if (me.getMPG() > bestMPG) {
                    vehicleWithBestMPG = me.getVehicleNum();
                    bestMPG = me.getMPG();
                }
                if (me.getMPG() < worstMPG){
                    vehicleWithWorstMPG = me.getVehicleNum();
                    worstMPG = me.getMPG();
                }
                totalMPG += me.getMPG();
            }
            out.println("total: " + totalMPG);
            double averageMPG = totalMPG / (double) list.size();
            out.println("MPG Statistics:");
            out.println("Best: " + vehicleWithBestMPG);
            out.println("Worst: " + vehicleWithWorstMPG);
            out.printf("Fleet Average: %.2f\n", averageMPG);
            out.println("Number of Vehicles: " + list.size());

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Vehicle	Miles	Gallons	MPG
1005	380.5	15.0	25.4
1003	240.1	12.0	20.0
1006	172.3	9.0		19.1
1008	317.7	14.0	22.7
1010	390.2	17.0	23.0
1015	152.1	4.0		38.0
1017	310.0	12.3	25.2
1020	409.9	17.9	22.9
total: 196.2929361370746
MPG Statistics:
Best: 1015
Worst: 1006
Fleet Average: 24.54
Number of Vehicles: 8

Process finished with exit code 0
 */