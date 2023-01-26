package Prog702p;

public class Beepers extends Animal {
    private String mySpecialWord;

    public Beepers (String f, String l, String special) {
        super (f, l);
        mySpecialWord = special;
    }

    public String getSpecialWord() {return mySpecialWord;}
}
