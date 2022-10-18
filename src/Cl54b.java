// Alex Nouansacksy
// Prog54bCl
// 10/18/2022
public class Cl54b {
    // Private
    private int myNum1;
    private int myNum2;
    private int myNum3;
    private int myNum4;
    private int mySum;
    private double myAverage;

    public Cl54b(int num1, int num2, int num3, int num4) {
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
    }

    public void setStuff() {
        mySum = myNum1 + myNum2 + myNum3 + myNum4;
        myAverage = (double) mySum / 4;
    }

    public int getMySum()  {return mySum;}
    public double getMyAverage() {return myAverage;}
}


