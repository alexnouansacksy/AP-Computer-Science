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
    double cost;
    double tax;
    double totalcost;
    double change;
    double cashGiven;
  
    public ClLP3Exercise10 (int burgers, int fries, int sodas, double cash) {
        myBurgers = burgers;
        myFries = fries;
        mySodas = sodas;
        myBurgerCost = 0;
        myFriesCost = 0;
        mySodasCost = 0;
        cost = 0;
        tax = 0;
        totalcost = 0;
        cashGiven = cash;
        change = 0;
    }

    public void setStuff() {
        myBurgerCost = myBurgers * 1.69;
        myFriesCost = myFries * 1.09;
        mySodasCost = mySodas * 0.99;
        cost = (myBurgerCost + myFriesCost + mySodasCost);
      
        tax = 0.065 * cost;
        totalcost = cost + tax;
        
        change = cashGiven - totalcost;
    }

    public String toString() {return String.format("Total before tax: $%.2f\nTax: $%.2f\nTotal: $%.2f\nChange: $%.2f", cost, tax, totalcost, change);}

    public void print() {
        System.out.println(this.toString());
    }
}

/*
PART A
Enter the number of burgers: 2
ENter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Tax: $0.90
Total: $14.68

PART B
Enter the number of burgers: 2
ENter the number of fries: 5
Enter the number of sodas: 5
Total before tax: $13.78
Cash Tendered: $20
Tax: $0.90
Total: $14.68
Change: $5.32
*/
