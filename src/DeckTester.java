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
		
		String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
		String[] suits = {"Spades", "Heart", "Club", "Diamond"};
		int[]values = {1,2,3,4,5,6,7,8,9,10,101,102,103};
		
		Deck deck = new Deck (ranks, suits, values);
		
		System.out.println(deck);
		
	}
}
