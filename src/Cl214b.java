// Alex Nouansacksy
// Prog214bCl
// 11/07/2022
public class Cl214b {
    private int myId;
    private double myYtd;
    private double myRate;
    private double myShiftCode;
    private double myHours;
    private double myWithholding;
    private double myFica;
    private double myNetPay;
    private double myBasePay;

    public Cl214b(int ID, double ytd, double rate, double shiftCode, double hours) {
        myId = ID;
        myYtd = ytd;
        myRate = rate;
        myShiftCode = shiftCode;
        myHours = hours;
        myWithholding = 0;
        myFica = 0;
        myNetPay = 0;
    }

    public void calc() {
        double taxrate = 0;
        myBasePay = myRate * myHours * myShiftCode;
        if (myBasePay < 100) taxrate = 0;
        else if (myBasePay > 100 && myBasePay < 150) taxrate = 0.08;
        else if (myBasePay > 150 && myBasePay < 200) taxrate = 0.12;
        else if (myBasePay > 200 && myBasePay < 300) taxrate = 0.15;
        else if (myBasePay >= 300) taxrate = 17;
        myWithholding = myBasePay * taxrate;

        myFica = 0;
        if (myYtd > 17300) myFica = 0;
        else if (myYtd + myBasePay <= 17300) myFica = myBasePay * 0.0605;
        else if (myYtd < 17300 && (myYtd + myBasePay > 17300)) {
            myFica = 0.0605 * ((myYtd + myBasePay) - 17300);
        }
        myNetPay = (myBasePay - myWithholding) - myFica;
    }

    public String toString() { return "Employee Number: " + myId + "\tHours: " + myHours + "\tShift Factor: " + myShiftCode
            + "\tGross Pay: " + myBasePay + "\tYear-to date: " + myYtd + "\nWithholding: " + myWithholding + "\tFICA: "
    + myFica + "\tNet Pay: " + myNetPay;}
}
