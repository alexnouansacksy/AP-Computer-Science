
package InheritanceReview;
import static java.lang.System.out;
public class Animal {
    private int myAge;
    private String myName;

    public Animal() {
        myAge = 0;
        myName = "";
    }

    public Animal (int age, String name) {
        myAge = age;
        myName = name;
    }

    public void eat() {out.println("I can eat");}

    public void speak() {out.println("Hello There!");}

    public int getAge(){return myAge;}
    public String getName() {return myName;}
}
