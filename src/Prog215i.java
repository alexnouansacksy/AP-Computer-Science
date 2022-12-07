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
            Scanner keyboard = new Scanner(new File("data/prog215i.dat"));
            ArrayList<Cl215i> list = new ArrayList<Cl215i>();

            while (keyboard.hasNext()) {
                int vehicle = keyboard.nextInt();
                double gallons = keyboard.nextDouble();
                double miles = keyboard.nextDouble();
                Cl215i wow = new Cl215i(vehicle, gallons, miles);
                list.add(wow);

                for (int lcv = 0; lcv < list.size(); lcv++) {
                    Cl215i current = list.get(lcv);
                    current.setStuff();
                }

            }
            for (Cl215i me: list) {
                out.printf("%d\t%.1f\t%.1f\t%.1f\n", me.getVehicleNum(), me.getMiles(), me.getGallons(), me.getMPG());
            }


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
