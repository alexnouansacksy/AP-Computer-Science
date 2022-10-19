// Alex Nouansacksy
// Prog54cCl
// 10/19/2022
public class Cl54c {
    private double myRadius;
    private double myArea;
    private double myCircumference;
    private double PI;

    public Cl54c(double radius) {
        myRadius = radius;
        PI = 3.14159;

    }

    public void setStuff() {
        myArea = PI * (myRadius * myRadius);
        myCircumference = myRadius * 2 * PI;
    }

    public double getMyArea() {return myArea;}
    public double getMyCircumference() {return myCircumference;}
}
