// Alex Nouansacksy
// Prog 402aCl
// 11/10/2022
public class Cl402a {
    private int myID;
    private int myScore;
    private int myTotal = 0;
    private double myDifference;
    private double myAverage;
    private int myCount;
    public Cl402a(int ID, int score) {
        myID = ID;
        myScore = score;
        myTotal += score;
        myCount++;
    }
    public void calc() {
        myAverage = myTotal / (double) myCount;
        myDifference = myScore - myAverage;
    }

    public double getMyAverage() {
        return myAverage;
    }

    public double getMyDifference() {
        return myDifference;
    }
}

   //public String toString() {return "ID: "+ myID + String.format("\t", myScore, "\t.2f\n", myDifference);}

