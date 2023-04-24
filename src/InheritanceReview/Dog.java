package InheritanceReview;
import static java.lang.System.out;
public class Dog extends Animal {
    private String myColor;

    public Dog(int age, String name, String color) {
        super(age, name);
        myColor = color;
    }

    @Override
    public void eat() {
        super.eat();
        out.println("I eat dog food");
    }

    // Overload
    public void speak(String word) {
        out.println(word);
    }

    //New Method
    public void bark() {out.println("Bark!");}

    public String toString() {
        return "Age: " + super.getAge() + "\nName: " + super.getName() + "\nColor: " + myColor;
    }
}
