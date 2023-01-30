package AbstClLab;
import static java.lang.System.inheritedChannel;
import static java.lang.System.out;

public class Triangle extends NotCircle{
    private double base;

    public Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public void setHeight(double h) {height = h;}
    public void setBase(double b) {base = b;}
    public double getHeight() {return height;}
    public double getBase() {return base;}

    public void calculateArea() {
        out.println("Area " + (0.5 * base * height));
    }

    public void calculateCircumference() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        double cir = hype + base + height;
        out.println("Perimeter " + cir);
    }

    public void calculatePerimter() {
        this.calculateCircumference();
    }
}
