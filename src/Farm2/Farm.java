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
        return 0;
    }

    public boolean feedAllAnimals() {return true;}


    public int getWeight() {
        return 0;
    }


    public ArrayList<Cow> getCows() {
        return null;
    }

    public ArrayList<Horse> getHorses() {
        return null;
    }


}
