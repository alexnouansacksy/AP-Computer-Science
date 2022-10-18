// Alex Nouansacksy
// Prog52aCl
// 10/17/2022
public class Cl52a {
    // Private
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;


    // Constructor: set up private data

    /**
     * returns a new Cl52a object
     * @param l lenght
     * @param w width
     */
    public Cl52a(int l, int w) {
        myLen = l;
        myWid = w;
        myArea = 0;
        myPerim = 0;
    }

    // Mutator: modifies private data
    public void setStuff() {
        myArea = myWid * myLen;
        myPerim = 2 * myWid + 2 * myLen;
        // return; // a void method does NOT return anything -- the "empty return" is implicit
    }

    // Accessors: returns private data

    /**
     * returns the area (lenght * width)
     * @return the calculated area after setStuff()
     */
    public int getArea() { return myArea; }
    public int getPerim() {return myPerim; }

    // Override Method

    public String toString() {
        return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);
    }

    // Easy Print Method
    public void print() {
        System.out.println(this.toString());
    }
}
/* Class:
 * private data
 * constructors
 * modifiers (mutators)
 * accessors
 */