package Farm2;

public class Cow extends Animal{
    public int myMilkProduced;

    public Cow (int weight, int milk, int haybales, int corn) {
        super(weight, haybales, corn);
        myMilkProduced = milk;
    }


}
