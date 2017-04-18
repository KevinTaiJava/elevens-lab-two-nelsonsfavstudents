import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	public int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		for(int i = 0; i < ranks.length; i++){ //for every rank
			for(int j = 0; j < suits.length; i++){ //for every suit
				Card card = new Card(ranks[i], suits[j], values[i]);
				this.cards.add(card);
			}
		}
		this.size = cards.size();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		this.size--;
		return(cards.get(size));
	}
	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String result = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			result = result + cards.get(k);
			if (k != 0) {
				result = result + ", ";
			}
			if ((size - k) % 2 == 0) {
				result = result + "\n";
			}
		}

		result = result + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			result = result + cards.get(k);
			if (k != size) {
				result = result + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				result = result + "\n";
			}
		}

		result = result + "\n";
		return result;
	}
}
