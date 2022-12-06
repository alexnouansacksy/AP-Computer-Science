public class Cl215i {
    private int myVehicleNum;
    private double myGallons;
    private double myMiles;
    private double myMPG;

    public Cl215i(int vehicleNum, double gallons, double miles) {
        myVehicleNum = vehicleNum;
        myGallons = gallons;
        myMiles = miles;
        myMPG = 0;
    }

    public void setStuff () {
        myMPG = myMiles / myGallons;
    }

    public int getVehicleNum() {return myVehicleNum;}
    public double getGallons() {return myGallons;}
    public double getMiles() {return myMiles;}
    public double getMPG() {return myMPG;}
}
