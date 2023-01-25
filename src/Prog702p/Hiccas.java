package Prog702p;

public class Hiccas extends Animal{
    private double myValue;

    public Hiccas(String f, String l, double value) {
        super(f, l);
        myValue = value;
    }

    public double getValue() {return myValue;}
}
