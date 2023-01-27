package Prog702q;

public class car extends vehicle{
    private String myName;
    private int myTires;
    private double myValue;

    public car (String name, int tires, double worth) {
        super(name, tires);
        myValue = worth;
    }

    public double getValue() {return myValue;}
}
