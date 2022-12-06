// Alex Nouansacksy
// Prog215hCl
// 12/06/2022
public class Cl215h {
    private double myNum1;
    private double myNum2;
    private double myNum3;
    private double myNum4;
    private double myNum5;
    private double myNum6;
    private double myNum7;
    private double myNum8;

    private double myAverage;

    public Cl215h (double num1, double num2, double num3, double num4, double num5, double num6, double num7, double num8) {
        myNum1 = num1;
        myNum2 = num2;
        myNum3 = num3;
        myNum4 = num4;
        myNum5 = num5;
        myNum6 = num6;
        myNum7 = num7;
        myNum8 = num8;
        myAverage = 0;
    }

    public void setStuff() {
        myAverage = (myNum1 + myNum2 + myNum3 + myNum4 + myNum5 + myNum6 + myNum7 + myNum8) / (double)8;
    }

    public double getAverage() {return myAverage;}
}
