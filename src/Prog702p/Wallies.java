package Prog702p;

public class Wallies extends Animal{
    private int myNumSteps;

    public Wallies (String f, String l, int steps) {
        super (f, l);
        myNumSteps = steps;
    }

    public int getNumSteps() {return myNumSteps;}
}
