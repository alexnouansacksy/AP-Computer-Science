// Alex Nouansacksy
// Prog213fCl
// 10/20/2022;
public class Cl213f {
    private int myHours;
    private double myCost;

    public Cl213f(int hours) {
        myHours = hours;
    }
    public void setStuff () {
        if (myHours >= 10000) {
            myCost += (0.07 * 2000);
            myCost += (0.05 * 8000);
            myCost += (0.04 * (myHours - 10000));
        }
        else if (myHours >= 2000) {
            myCost += (0.07 * 2000);
            myCost += (0.05 * (myHours - 2000));
        }
        else if (myHours > 0) {
            myCost += 0.07 * myHours;
        }
    }
    public double getmyCost() {return myCost;}

    public String toString() {return "The cost of " + myHours + " hours is $" +  String.format("%.2f", myCost);}
}
