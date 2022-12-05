// Alex Nouansacksy
// Prog213v
// 12/05/2022
public class Bank {
    private double myAmount;
    public Bank(double amount) {
        myAmount = amount;
    }

    public double getAmount() {return myAmount;}

    public void calc(Transaction thing) {
        if(thing.getCode().equals("C")) {
            if (thing.getAmount() > this.getAmount()) {
                myAmount = this.getAmount() - 10;
            } else {
                myAmount -= thing.getAmount();
            }
        } else if (thing.getCode().equals("S")) {
            myAmount -= thing.getAmount();
        } else if (thing.getCode().equals("D")) {
            myAmount += thing.getAmount();
        }
    }
}
