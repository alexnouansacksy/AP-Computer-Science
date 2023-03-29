package ElevensLab;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card a = new Card("adf", "asdfjalskdf", 2);
        Card b = new Card("adf", "asdfjalskdf", 2);
        Card c = new Card("a", "b", 2);
        System.out.println(a.rank() + "\n" + a.suit() + "\n" + a.pointValue());
        System.out.println(b.rank() + "\n" + b.suit() + "\n" + b.pointValue());
        if (a.matches(b)) System.out.println("They are the same!");
        if (a.matches(c)) System.out.println("They are the same!");
        else System.out.println("They are not the same!");
        System.out.println(c.rank() + "\n" + c.suit() + "\n" + c.pointValue());

    }
}
