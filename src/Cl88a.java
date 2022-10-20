// Alex Nouansacksy
// Prog88aCl
// 10/20/2022
public class Cl88a {
    private int myNum1;
    private int myNum2;
    private int mySum;
    private int myDifference;
    private int myProduct;
    private double myAverage;
    private int myAbsoluteValue;
    private int myMax;
    private int myMin;

    public Cl88a (int num1, int num2) {
        myNum1 = num1;
        myNum2 = num2;
    }

    public void setStuff() {
        mySum = myNum1 + myNum2;
        myDifference = myNum1 - myNum2;
        myProduct = myNum1 * myNum2;
        myAverage = (myNum1 + myNum2) / (double) 2;
        myAbsoluteValue = Math.abs(myDifference);
        if (myNum1 > myNum2) {
            myMax = myNum1;
            myMin = myNum2;
        }
        else {
            myMax = myNum2;
            myMin = myNum1;
        }
    }

    public int getMySum() {return mySum;}
    public int getMyDifference() {return myDifference;}
    public int getMyProduct() {return myProduct;}
    public double getMyAverage() {return myAverage;}
    public int getMyAbsoluteValue() {return myAbsoluteValue;}
    public int getMyMax() {return myMax;}
    public int getMyMin() {return myMin;}

}

