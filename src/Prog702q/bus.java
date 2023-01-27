package Prog702q;

public class bus extends vehicle{
    private String myName;
    private int myTires;
    private String myTown;
    private double myValue;

    public bus (String name, int tires, String town) {
        super(name, tires);
        myTown = town;
        myValue = 50000;
    }


    public String getTown() {return myTown;}
    public double getValue() {return myValue;}
}
