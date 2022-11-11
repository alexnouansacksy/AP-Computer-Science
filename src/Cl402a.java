// Alex Nouansacksy
// Prog 402aCl
// 11/10/2022
public class Cl402a {
    private int myID;
    private int myScore;
    private double myDifference;
    private int myCount;
    public Cl402a(int ID, int score) {
        myID = ID;
        myScore = score;
        myDifference = 0;
    }
    public void calc(double average) {
        myDifference = myScore - average;
    }
    public String toString() {return myID + String.format("\t\t%d\t\t%.2f", myScore, myDifference);}


}


