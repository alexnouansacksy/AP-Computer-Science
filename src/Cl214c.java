public class Cl214c {
    private String myGasType;
    private double myGallons;
    private String myCarWash;
    private double myPerGallon;

    private double myGasCost;
    private double myWashCost;
    private double myGrandTotal;

    public Cl214c(String gasType, double gallons, String carWash) {
        myGasType = gasType;
        myGallons = gallons;
        myCarWash = carWash;
        myGasCost = 0;
        myWashCost = 0;
        myGrandTotal = 0;
        myPerGallon = 0;
    }

    public void setCosts() {
        if (myGasType.equals("R")) {
            myGasType = "Regular";
            myPerGallon = 1.359;
        }
        if (myGasType.equals("P")) {
            myGasType = "Premium";
            myPerGallon = 1.479;
        }
        if (myGasType.equals("H")) {
            myGasType = "High Octane";
            myPerGallon = 1.429;
        }

        myGasCost = myGallons * myPerGallon;
        if (myCarWash.equals("Y")) {
            if(myGallons < 20) {
                if (myGallons > 10) {
                    myWashCost = (2 - (0.2 * (myGallons % 10)));
                } else {
                    myWashCost = 2;
                }
            }   
        }
        myGrandTotal = myGasCost + myWashCost;
    }

    public double getPerGallon() {return myPerGallon;}
    public double getGasCost() {return myGasCost;}
    public double getWashCost() {return myWashCost;}
    public double getGrandTotal() {return myGrandTotal;}
    public String getGasType() {return myGasType;}
    public double getGallons() {return myGallons;}
    public String getWash() {return myCarWash;}

}
