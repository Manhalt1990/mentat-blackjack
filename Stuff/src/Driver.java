import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cards card1 = new Cards(2, 'C', "2C");
		Cards card2 = new Cards(3, 'C', "3C");
		Cards card3 = new Cards(4, 'C', "4C");
		Cards card4 = new Cards(5, 'C', "5C");
		Cards card5 = new Cards(6, 'C', "6C");
		Cards card6 = new Cards(7, 'C', "7C");
		Cards card7 = new Cards(8, 'C', "8C");
		Cards card8 = new Cards(9, 'C', "9C");
		Cards card9 = new Cards(10, 'C', "10C");
		Cards card10 = new Cards(10, 'C', "JC");
		Cards card11 = new Cards(10, 'C', "QC");

		ArrayList<Cards> deck = new ArrayList<Cards>(); // shuffle test
		deck.add(card1);
		deck.add(card2);
		deck.add(card3);
		deck.add(card4);
		deck.add(card5);
		deck.add(card6);
		deck.add(card7);
		deck.add(card8);
		deck.add(card9);
		deck.add(card10);
		deck.add(card11);

		System.out.println("Before Shuffling, Deck: ");

		for (int i = 0; i < deck.size(); i++) {
			System.out.print(deck.get(i).getFace() + " ");
		} 													

		System.out.println();
		System.out.println("After Shuffling, Deck: ");
		Collections.shuffle(deck);
		for (int i = 0; i < deck.size(); i++) {
			System.out.print(deck.get(i).getFace() + " ");
		}

		ArrayList<Cards> hand = new ArrayList<Cards>();
		hand.add(card1);
		hand.add(card2);

		// System.out.println(Cards.addValues(card1, card5));

		// Cards.compare(card11, card7);

		Iterator it = hand.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			// System.out.print(element + ", ");
		}
		System.out.println();

		System.out.print("Hand: ");

		ListIterator<Cards> clst = hand.listIterator();

		while (clst.hasNext()) {
			Object element = clst.next();
			int h = (clst.nextIndex() - 1);
			String hand1 = (hand.get(h).getFace() + " ");
			System.out.print(hand1);
		}
		System.out.println();
		int htotal = (hand.get(0).getValue() + hand.get(1).getValue());
		System.out.println("Total: " + htotal);

		hand.add(card3);

		it = hand.iterator();

		System.out.println("Hand: "); // prints hand face values
		for (int i = 0; i < hand.size(); i++) {
			System.out.print(hand.get(i).getFace() + " ");
		}

		/*
		 * System.out.println("Hand: " + hand.get(h).getFace());
		 * 
		 * int total = (hand.get(0).getValue() + hand.get(1).getValue());
		 * System.out.println("Hand Total: " + total);
		 */
	}

}
