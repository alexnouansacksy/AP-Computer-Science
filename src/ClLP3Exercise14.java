// Alex Nouansacksy
// LP3Exercise14Cl
// 11/23/2022

public class ClLP3Exercise14 {
  int myAwbreyNewYork;
  int myMartinezNewYork;
  int myAwbreyNewJersey;
  int myMartinezNewJersey;
  int myAwbreyConnecticut;
  int myMartinezConnecticut;
  int myAwbreyTotal;
  int myMartinezTotal;
  double myTotal;
  double myAwbreyPercentage;
  double myMartinezPercentage;

  public ClLP3Exercise14 (int nyAwbrey, int nyMartinez, int njAwbrey, int njMartinez, int ctAwbrey, int ctMartinez) {
    myAwbreyNewYork = nyAwbrey;
    myMartinezNewYork = nyMartinez;
    myAwbreyNewJersey = njAwbrey;
    myMartinezNewJersey = njMartinez;
    myAwbreyConnecticut = ctAwbrey;
    myMartinezConnecticut = ctMartinez;
    myAwbreyTotal = 0;
    myMartinezTotal = 0;
    myTotal = 0;
    myAwbreyPercentage = 0;
    myMartinezPercentage = 0;
  }

  public void setStuff() {
    myAwbreyTotal = (myAwbreyNewYork + myAwbreyNewJersey + myAwbreyConnecticut);
    myMartinezTotal = (myMartinezNewYork + myMartinezNewJersey + myMartinezConnecticut);
    myTotal = myAwbreyTotal + myMartinezTotal;
    myAwbreyPercentage = myAwbreyTotal /  myTotal;
    myAwbreyPercentage *= 100;
    myMartinezPercentage = myMartinezTotal / myTotal;
    myMartinezPercentage *= 100;
    
  }

  public String toString() {return String.format("Candidates\t\tVotes\tPercentage\nAwbrey\t\t\t%d\t%.2f\nMartinez\t\t%d\t%.2f\nTOTAL VOTES:\t%.2f", myAwbreyTotal, myAwbreyPercentage, myMartinezTotal, myMartinezPercentage, myTotal);}

  public void print() {
        System.out.println(this.toString());
  }
}
