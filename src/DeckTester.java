/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank = {"1","2","3","4","5"};
		String[] suit = {"D","C","H","S"};
		int[] value = {1,2,3,4,5};
		Deck deck1 = new Deck(rank, suit, value);
		//System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		deck1.shuffle();
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
	}
}
