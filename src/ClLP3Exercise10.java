// Alex Nouansacksy
// LP3Exercise10Class
// 11/22/2022
public class ClLP3Exercise10 {
    int myBurgers;
    double myBurgerCost;
    int myFries;
    double myFriesCost;
    int mySodas;
    double mySodasCost;
    double tax;
    double totalcost;

    public ClLP3Exercise10 (int burgers, int fries, int sodas) {
        myBurgers = burgers;
        myFries = fries;
        mySodas = sodas;
    }

    public void setStuff() {
        myBurgerCost = myBurgers * 1.69;
        myFriesCost = myFries * 1.09;
        mySodasCost = mySodas * 0.99;

        tax = 0.065 * (myBurgerCost + myFriesCost + mySodasCost);
        totalcost = (myBurgerCost + myFriesCost + mySodasCost) + tax;
    }

    public String toString() {return String.format("Total before tax: ");}
    //public getChange(int tendered) {

    //}
}
