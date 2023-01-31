package AbstClLab;
import static java.lang.System.out;


public abstract class NotCircle implements Shape{
    protected double height;

    public abstract double getHeight();
    public abstract void setHeight(double h);

    public void printClass() {
        out.println(this.getClass().getSimpleName());
    }
}
