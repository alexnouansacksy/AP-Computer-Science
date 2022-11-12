// Alex Nouansacksy
// Prog435aCl
// 11/11/2022
public class Cl435a {
    private int myVehicleType;
    private int myGate;
    private double myBaseToll;
    private double myFactor;
    private double myCost;
    private String myCarType;

    public Cl435a(int vehicleType, int gate) {
        myVehicleType = vehicleType;
        myGate = gate;
        myBaseToll = 0;
        myFactor = 0;
        myCost = 0;
    }

    public void calc() {
        if (myVehicleType == 1) {
            myFactor = 1;
            myCarType = "Compact Car  ";
        }
        else if (myVehicleType == 2) {
            myFactor = 1.3;
            myCarType = "Small Car    ";
        }
        else if (myVehicleType == 3) {
            myFactor = 1.6;
            myCarType = "Mid Size Car ";
        }
        else if (myVehicleType == 4) {
            myFactor = 2.0;
            myCarType = "Full Size Car";
        }
        else if (myVehicleType == 5) {
            myFactor = 2.4;
            myCarType = "Truck        ";
        }
        else if (myVehicleType == 6) {
            myFactor = 2.7;
            myCarType = "16 Wheeler   ";
        }

        if (myGate == 1) myBaseToll = 1.35;
        else if (myGate == 2) myBaseToll = 2.00;
        else if (myGate == 3) myBaseToll = 2.50;
        else if (myGate == 4) myBaseToll = 3.25;
        else if (myGate == 5) myBaseToll = 4.10;
        else if (myGate == 6) myBaseToll = 4.80;
        else if (myGate == 7) myBaseToll = 5.50;
        else if (myGate == 8) myBaseToll = 6.00;

        myCost = myBaseToll * myFactor;
    }

    public String toString() {
        return myCarType + String.format("\t$%.2f\t\t%.2f\t$%.2f", myBaseToll, myFactor, myCost);
    }
}
