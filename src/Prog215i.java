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
            ArrayList<Cl215i> wow = new ArrayList<Cl215i>();

            while (keyboard.hasNext()) {
                if(keyboard.nextDouble() != 0){
                    int vehicle = keyboard.nextInt();
                    double gallons = keyboard.nextDouble();
                    double miles = keyboard.nextDouble();
                    Cl215i alex = new Cl215i(vehicle, gallons, miles);
                    wow.add(alex);
                }
                for (int lcv = 0; lcv < wow.size(); lcv++) {
                    Cl215i current = wow.get(lcv);
                    current.setStuff();
                }

                for (Cl215i me: wow) {
                    out.printf("%d\t%.1f\t%.1f\t%.1f\n", me.getVehicleNum(), me.getMiles(), me.getGallons(), me.getMPG());
                }
            }
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
