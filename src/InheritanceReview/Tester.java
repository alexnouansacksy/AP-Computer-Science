package InheritanceReview;

public class Tester {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "Bucky", "White");
        dog.eat();
        dog.bark();
        dog.speak();
        dog.speak("Woof");
        System.out.println(dog);
    }
}
/*
I can eat
I eat dog food
Bark!
Hello There!
Woof
Age: 5
Name: Bucky
Color: White

Process finished with exit code 0

 */