package Prog702q;

public class vehicle implements names{
    private String myName;
    private int myTires;
    private double myValue;

    public vehicle (String name, int numTires, double value) {
        myName = name;
        myTires = numTires;
        myValue = value;
    }

    public String getName() {return myName;}
    public int getTire() {return myTires;}
    public double getValue() {return myValue;}
}
