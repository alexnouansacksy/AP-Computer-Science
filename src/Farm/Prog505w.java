package Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = keyboard.nextInt();
            double hayCost = keyboard.nextDouble();
            int corn = keyboard.nextInt();
            double cornCost = keyboard.nextDouble();

            int cowRows = keyboard.nextInt();
            int cowPens = keyboard.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = keyboard.next();
                    int weight = keyboard.nextInt();
                    int milk = keyboard.nextInt();
                    int hayEaten = keyboard.nextInt();
                    int cornEaten = keyboard.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = keyboard.nextInt();
            int horsePens = keyboard.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = keyboard.next();
                    int weight = keyboard.nextInt();
                    int hayEaten = keyboard.nextInt();
                    int cornEaten = keyboard.nextInt();
                    int rides = keyboard.nextInt();
                    double rideCost = keyboard.nextDouble();
                    Horse fred = new Horse(name, weight, hayEaten, cornEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            // ...  everything else

            double minHorse = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorse) {
                        minHorse = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }

            out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
