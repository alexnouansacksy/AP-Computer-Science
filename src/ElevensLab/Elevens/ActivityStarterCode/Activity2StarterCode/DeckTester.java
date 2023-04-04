package ElevensLab.Elevens.ActivityStarterCode.Activity2StarterCode;

import static java.lang.System.out;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};

		Deck a = new Deck(ranks, suits, pointValues);

		out.println(a.toString());
		a.deal();
		a.deal();
		out.println(a.toString());

	}
}
