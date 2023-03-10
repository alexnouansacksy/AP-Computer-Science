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
            out.println("Cumulative weight of the animals is " + farm.getWeight());
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


