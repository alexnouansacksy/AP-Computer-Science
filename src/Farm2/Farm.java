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

    public Farm (ArrayList<Animal> horses, ArrayList<Animal> cows, int hay, double haycost, int corn, double corncost) {
        myNumHayBales = hay;
        myNumCorn = corn;
        myHayCost = haycost;
        myCornCost = corncost;
    }

    private double cowIncome(double perPound, int poundsProduced)  {
        return perPound * poundsProduced;
    }

    private double horseIncome(int rides, double ridesCost)  {
        return rides * ridesCost;
    }

    public double farmIncome() {
        for (Animal a : myHorses) {
        }
    }




    public int getWeight() {
        return 0;
    }

    public double getCost() {
        return 0;
    }

    public ArrayList<Cow> getCows() {
        return null;
    }

    public ArrayList<Horse> getHorses() {
        return null;
    }


}
