// Alex Nouansacksy
// Prog82aCl
// 10/20/2022
public class Cl82a {
    private int mySpeed;
    private int myLimit;
    private int myFine;

    public Cl82a (int limit, int speed) {
        myLimit = limit;
        mySpeed = speed;
    }

    public void setStuff() {
        myFine = 20 + ((mySpeed - myLimit) * 5);
    }
    public int getMyFine() {return myFine;}

}
