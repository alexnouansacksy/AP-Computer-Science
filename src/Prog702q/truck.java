package Prog702q;

public class truck extends vehicle{
    private String myName;
    private int myTires;
    private double myMillage;
    private double myValue;

    public truck (String name, int tires, double millage) {
        super(name, tires);
        myMillage = millage;
        myValue = 50000 - (0.25 * myMillage);

    }

    public void setStuff() {
    }

    public double getMillage() {return myMillage;}
    public double getValue() {return myValue;}
}
