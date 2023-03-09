package Farm2;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog505t.dat"));

            int hay = keyboard.nextInt();
            double hayCost = keyboard.nextDouble();
            int corn = keyboard.nextInt();
            double cornCost = keyboard.nextDouble();

            ArrayList<Animal> cows = new ArrayList<Animal>();
            ArrayList<Animal> horses = new ArrayList<Animal>();

            int numcows = keyboard.nextInt();
            for (int i = 0; i < numcows; i ++) {
                int weight = keyboard.nextInt();
                int milkProduced = keyboard.nextInt();
                int hayBalesEaten = keyboard.nextInt();
                int cornEaten = keyboard.nextInt();

                Cow wow = new Cow(weight, milkProduced, hayBalesEaten, cornEaten);
                cows.add(wow);
            }

            int numhorses = keyboard.nextInt();
            for (int i = 0; i < numhorses; i++) {
                int weight = keyboard.nextInt();
                int hayBalesEaten = keyboard.nextInt();
                int cornEaten = keyboard.nextInt();
                int rides = keyboard.nextInt();
                double ridesCost = keyboard.nextDouble();

                Horse wow = new Horse(weight, hayBalesEaten, cornEaten, rides, ridesCost);
                horses.add(wow);
            }

            Farm farm = new Farm(cows, horses, hay, hayCost, corn, cornCost);





        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
