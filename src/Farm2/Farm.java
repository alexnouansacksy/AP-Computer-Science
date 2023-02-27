package Farm2;
import java.util.*;
public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    @Override
    public boolean feedAllAnimals() {
        return false;
    }

    @Override
    public double farmIncome() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public ArrayList<Cow> getCows() {
        return null;
    }

    @Override
    public ArrayList<Horse> getHorses() {
        return null;
    }

    // …

}
