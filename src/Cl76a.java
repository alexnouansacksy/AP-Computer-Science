// Alex Nouansacksy
// Prog76aCl
// 10/19/2022
public class Cl76a {
    private int myNum;
    private int myProduct1;
    private int myProduct2;

    public Cl76a (int num) {
        myNum = num;
    }

    public void setStuff() {
        myProduct1 = myNum * 9;
        myProduct2 = myProduct1 * 12345679;
    }

    public int getMyProduct1() {return myProduct1;}
    public int getMyProduct2() {return myProduct2;}

}
