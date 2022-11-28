public class ClLP4Exercise8 {
    private final int myA;
    private final int myC;
    private final int myM;
    private int myX0; // Random Seed

    public ClLP4Exercise8(int a, int c, int m, int x0) {
        myA = a;
        myC = c;
        myM = m;
        myX0 = x0;
    }

    public int nextInt() {
        myX0 = (myA * myX0 + myC) % myM;
        return myX0;
    }

    public String toString() {
        return "(" + myA + " * " + myX0 + " + " + myC + ") % " + myM + " = " + this.nextInt(); // use the method i just used in this class
    }

    public void print() {
        System.out.println(this.toString());
    }

}
