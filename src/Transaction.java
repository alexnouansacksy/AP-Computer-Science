// Alex Nouansacksy
// Prog213v
// 12/05/2022
public class Transaction {
    private String myType;
    private double myAmount;

    public Transaction(String type, double amount) {
        myType= type;
        myAmount = amount;
    }

    public String getCode() {return myType;}
    public double getAmount() {return myAmount;}
}
