package Prog702q;

public class vehicle implements names{
    private String myName;
    private int myTires;
    double myValue;

    public vehicle (String name, int numTires) {
        myName = name;
        myTires = numTires;
    }

    public String getName() {return myName;}
    public int getTire() {return myTires;}
    public double getValue() {return myValue;}
}
