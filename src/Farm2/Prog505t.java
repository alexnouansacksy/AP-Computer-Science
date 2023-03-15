package Farm2;
// Alex Nouansacksy
// FARM (Prog505t)
// 03/10/2023

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

            ArrayList<Cow> cows = new ArrayList<Cow>();
            ArrayList<Horse> horses = new ArrayList<Horse>();

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

            out.println("Income for the day is $" + farm.farmIncome());
            out.println("Cost for feeding for the day is $" + farm.getCost());
            out.println("Cumulative weight of the animals is " + farm.getWeight() + " lbs");
            farm.feedAllAnimals();
            farm.removeCows();
            farm.removeHorses();
            cows.get(0).setWeight(1250);
            cows.get(0).setMilk(80);
            cows.get(0).setHay(3);
            cows.get(0).setCorn(4);
            out.println("First cow now has a weight of " + cows.get(0).getWeight() +
                    ", produces " + cows.get(0).getMilkProduced() + " pounds of milk a day, eats " + cows.get(0).getHayBales() +
                    " hay bales per day, and eats " + cows.get(0).getCorn() + " cobs of corn a day.");
            out.println("There are now " + cows.size() + " cows and " + horses.size() + " horses.");


        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Income for the day is $259.4
Cost for feeding for the day is $180.5
Cumulative weight of the animals is 42835 lbs
All animals have been fed.
There are 939 hay bales remaining.
There is 2420 corn remaining.
Removed a cow that produced 0 gallons of milk a day.
Removed a cow that produced 18 gallons of milk a day.
Removed a cow that produced 22 gallons of milk a day.
Removed a horse that makes $1.2
Removed a horse that makes $2.4
First cow now has a weight of 1250, produces 80 pounds of milk a day, eats 3 hay bales per day, and eats 4 cobs of corn a day.
There are now 12 cows and 8 horses.

Process finished with exit code 0

 */
