package Farm2;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm (ArrayList<Cow> cows, ArrayList<Horse> horses, int hay, double haycost, int corn, double corncost) {
        myNumHayBales = hay;
        myNumCorn = corn;
        myHayCost = haycost;
        myCornCost = corncost;
        myHorses = horses;
        myCows = cows;
    }

    private double cowIncome(double perPound, int poundsProduced)  {
        return perPound * poundsProduced;
    }

    private double horseIncome(int rides, double ridesCost)  {
        return rides * ridesCost;
    }

    public double farmIncome() {
        double horsesMoney = 0;
        for (Horse a : myHorses) {
            horsesMoney += horseIncome(a.getRides(), a.getRidesCost());
        }
        double cowsMoney = 0;
        for (Cow a: myCows) {
            cowsMoney += cowIncome(0.2, a.getMilkProduced());
        }
        return horsesMoney + cowsMoney;
    }

    public double getCost() {
        double totCost = 0;
        for (Horse a : myHorses) {
            totCost += a.getHayBales() * myHayCost;
            totCost += a.getCorn() * myCornCost;
        }
        for (Cow a : myCows) {
            totCost += a.getHayBales() * myHayCost;
            totCost += a.getCorn() * myCornCost;
        }
        return totCost;
    }

    public int getWeight() {
        int totWeight = 0;
        for (Horse a : myHorses) totWeight += a.getWeight();
        for (Cow a: myCows) totWeight += a.getWeight();
        return totWeight;
    }

    public boolean feedAllAnimals() {
        int cornNeeded = 0;
        int hayNeeded = 0;
        for (Horse horse : myHorses) {
            cornNeeded += horse.getCorn();
            hayNeeded += horse.getHayBales();
        }
        for (Cow cow : myCows) {
            cornNeeded += cow.getCorn();
            hayNeeded += cow.getHayBales();
        }
        boolean sufficient = ((cornNeeded < myNumCorn) && (hayNeeded < myNumHayBales));
        if (sufficient) {
            myNumHayBales -= hayNeeded;
            myNumCorn -= cornNeeded;
            out.println("All animals have been fed.\n" + "There are " + myNumHayBales + " hay bales remaining.\nThere is "
            + myNumCorn + " corn remaining. ");
        } else if ((cornNeeded > myNumCorn) && (hayNeeded > myNumHayBales)) {
            out.println((cornNeeded - myNumCorn) + " more corn is needed\n" + (hayNeeded - myNumHayBales) + "more hay bales are needed.");
        } else if (cornNeeded > myNumCorn) {
            out.println((cornNeeded - myNumCorn) + " more corn is needed.");
        } else if (hayNeeded > myNumHayBales) {
            out.println((hayNeeded - myNumHayBales) + " more hay bales are needed.");
        }
        return sufficient;
    }

    public ArrayList<Cow> removeCows() {
        for (int i = 0; i < 3; i++) {
            int lowest = 0;
            int leastMilk = Integer.MAX_VALUE;
            for (int j = 0; j < myCows.size(); j++) {
                if (myCows.get(j).getMilkProduced() < leastMilk) {
                    lowest = j;
                    leastMilk = myCows.get(j).getMilkProduced();
                }
            }
            out.println("Removed a cow that produced " + leastMilk + " gallons of milk a day.");
            myCows.remove(lowest);
        }
        return myCows;
    }

    public ArrayList<Horse> removeHorses() {
        for (int i = 0; i < 2; i++) {
            int lowest = 0;
            double lowestIncome = Integer.MAX_VALUE;
            for (int j = 0; j < myHorses.size(); j++) {
                double income = horseIncome(myHorses.get(j).getRides(), myHorses.get(j).getRidesCost());
                if (income < lowestIncome) {
                    lowest = j;
                    lowestIncome = income;
                }
            }
            out.println("Removed a horse that makes $" + lowestIncome);
            myHorses.remove(lowest);
        }
        return myHorses;
    }



    public ArrayList<Cow> getCows() {
        return myCows;
    }

    public ArrayList<Horse> getHorses() {
        return myHorses;
    }


}
