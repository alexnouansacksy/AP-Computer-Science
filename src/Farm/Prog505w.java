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

            // income for the day

            double totIncome = 0;
            for (Animal animal : animals) {
                totIncome += animal.value(cornCost, hayCost);
            }
            out.println("Total income for today is $" + totIncome);

            // cumulative weight

            double totWeight = 0;
            for (Animal animal : animals) {
                totWeight += animal.getWeight();
            }
            out.println("Culumative weight is " + totWeight);

            // enough food to feed the animals

            double cornEaten = 0;
            double hayEaten = 0;

            for(Animal animal : animals) {
                cornEaten += animal.getNumCorn();
                hayEaten += animal.getNumHayBales();
            }

            if (hayEaten < hay) out.println("There is enough hay.");
            else out.println("There is not enough hay.");

            if (cornEaten < corn) out.println("There is enough corn.");
            else out.println("There is not enough corn.");

            // cow that makes the most money
            double maxCow = 0;
            int maxCowIndex = 0;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i) instanceof Cow) {
                    Cow cow = (Cow) animals.get(i);
                    if (cow.value(cornCost, hayCost) > maxCow) {
                        maxCow = cow.value(cornCost, hayCost);
                        maxCowIndex = i;
                    }
                }
            }

            out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());




            // horse with least money
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
/*
Total income for today is $213.5
Culumative weight is 32790.0
There is enough hay.
There is enough corn.
Cow Barb makes the most money
Horse JohnJohn makes the least money

Process finished with exit code 0
 */