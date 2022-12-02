import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;
// Alex Nouansacksy
// Prog214c with ArrayLists
// 12/01/2022

public class Prog214cArrayList {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog214c.dat"));
            ArrayList<Cl214c> list = new ArrayList<Cl214c>();

            while (keyboard.hasNext()) {
                String gasType = keyboard.next();
                double gallons = keyboard.nextDouble();
                String carWash = keyboard.next();
                Cl214c wow = new Cl214c(gasType, gallons, carWash);
                list.add(wow);

                for (int lcv = 0; lcv < list.size(); lcv++) {
                    Cl214c current = list.get(lcv);
                    current.setCosts();
                }


            }

            for (Cl214c me : list) {
                out.println("COMPSCI PETROLEUM COMPANY");
                out.println("----------------------------------------");
                out.println(me.getGasType() + "\t\t\t\t" + me.getGallons() + " gallons @ " + me.getPerGallon());
                out.println("----------------------------------------");
                out.println("Gasoline\t\t\t\t\t\t\t" + String.format("%.2f", me.getGasCost()));
                out.println("Wash " + me.getWash() + "\t\t\t\t\t\t\t\t" + String.format("%.2f", me.getWashCost()));
                out.println("\t\t\t\t\t\t\t\t\t------");
                out.println(("Total Due\t\t\t\t\t\t\t" + String.format("%.2f", me.getGrandTotal())));
                out.println("----------------------------------------");
                out.println("");
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
----------------------------------------
Premium				15.0 gallons @ 1.479
----------------------------------------
Gasoline							22.19
Wash N								0.00
									------
Total Due							22.19
----------------------------------------

COMPSCI PETROLEUM COMPANY
----------------------------------------
Regular				21.4 gallons @ 1.359
----------------------------------------
Gasoline							29.08
Wash Y								0.00
									------
Total Due							29.08
----------------------------------------

COMPSCI PETROLEUM COMPANY
----------------------------------------
High Octane				7.5 gallons @ 1.429
----------------------------------------
Gasoline							10.72
Wash Y								2.00
									------
Total Due							12.72
----------------------------------------

COMPSCI PETROLEUM COMPANY
----------------------------------------
Regular				17.9 gallons @ 1.359
----------------------------------------
Gasoline							24.33
Wash Y								0.60
									------
Total Due							24.93
----------------------------------------


Process finished with exit code 0

 */
