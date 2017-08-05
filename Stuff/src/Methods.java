import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Cards> deck = new ArrayList<Cards>(); // shuffle test
		addCardsToDeck(deck);
		
		ArrayList<Cards> phand = new ArrayList<Cards>();
		ArrayList<Cards> dhand = new ArrayList<Cards>(); 
		int ptotal = 0;
		int dtotal = 0;
		
		ArrayList<Dcomment> dlrcmt = new ArrayList<Dcomment>();
		dlrcmt.add(Dcomment.comment1);
		dlrcmt.add(Dcomment.comment2);
		dlrcmt.add(Dcomment.comment3);
		dlrcmt.add(Dcomment.comment4);
		dlrcmt.add(Dcomment.comment5);
		dlrcmt.add(Dcomment.comment6);
		dlrcmt.add(Dcomment.comment7);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Press P to (p)lay Blackjack or any other key to quit");
		String decision = in.next();
		System.out.println("Entered: " + decision);
		if (decision.equals("P") || decision.equals("p")){
			Cards.shuffle(deck);
			Cards.deal(deck, phand, dhand);
			System.out.println("Your Hand: ");
			Cards.show(phand);
			System.out.println();
			System.out.println("Dealer's Hand: ");
			Cards.show(dhand);
			System.out.println();
			System.out.println("Player total: ");
			ptotal = Cards.total(phand);
			dtotal = Cards.total(dhand);
			System.out.println(ptotal);

		}
		else if (!(decision.equals("P") || decision.equals("p"))){
			System.out.println("The only way to truly win is not to play...");
			in.close();
			return;
		}
		
		while (ptotal < 21) {
			System.out.println("Press H to (h)it or S to (s)tand");
			String hOrS = in.next();
			System.out.println("Entered: " + hOrS);
			if (hOrS.equals("H") || hOrS.equals("h")){
				Cards.hit(deck, phand);
				System.out.println("Your Hand: ");
				Cards.show(phand);
				System.out.println();
				System.out.println("Dealer's Hand: ");
				Cards.show(dhand);
				ptotal += phand.get(0).getValue();
				System.out.println();
				System.out.println("Player total: " + ptotal);
			}
			else if (hOrS.equals("S") || hOrS.equals("s")){
				in.close();
				System.out.println("Your Hand: ");
				Cards.show(phand);
				System.out.println();
				System.out.println("Dealer's Hand: ");
				Cards.show(dhand);
				System.out.println();
				System.out.println("Standing on: " + ptotal);
				if (dtotal > ptotal) {
					System.out.println("Dealer's total higher. Dealer Wins.");
					return;
				}
				else while (dtotal < 17) {
					System.out.println("Dealer hits.");
					Cards.hit(deck, dhand);
					System.out.println("Your Hand: ");
					Cards.show(phand);
					System.out.println();
					System.out.println("Dealer's Hand: ");
					Cards.show(dhand);
					dtotal += dhand.get(0).getValue();
					System.out.println();
				}
				if (dtotal > 16 && dtotal < 22 && dtotal < ptotal){	
					System.out.println("You beat the dealer. You win.");
					return;
				}
				else if (dtotal > 16 && dtotal < 22 && dtotal > ptotal){
					System.out.println("Dealer beats player. Dealer wins.");
					return;
				}
				
				else if (dtotal > 21) {
					System.out.println("Dealer Busts. You win!");
					return;
				}
				else if(dtotal == ptotal){
					System.out.println("Tie score. Push!");
					return;
				}
				
				
			}
			else {
				Dcomment.comment(dlrcmt);
				System.out.println("Your Hand: ");
				Cards.show(phand);
				System.out.println();
				System.out.println("Dealer's Hand: ");
				Cards.show(dhand);
				System.out.println();
			}
			if (ptotal > 21){
				System.out.println("Over 21. Player Busts!");
			}
			else if (ptotal == 21){
				System.out.println("21! You win.");
			}
		
		}
			

		/*
		System.out.println("Before Shuffling, Deck: ");
		
		Cards.show(deck);

		Cards.shuffle(deck);
		System.out.println();
		System.out.println("After Shuffling, Deck: ");

		System.out.println();

		System.out.print("Deck before deal: ");
		Cards.show(deck);
		System.out.println();
		System.out.print("Player Hand before deal: ");
		Cards.show(phand);

		Cards.deal(deck, phand, dhand);
		System.out.print("Deck after deal: ");
		Cards.show(deck);
		System.out.println();
		System.out.print("Player Hand after deal: ");
		Cards.show(phand);
		System.out.println();
		System.out.print("Dealer Hand after deal: ");
		Cards.show(dhand);

		System.out.println();

		System.out.print("Deck before hit: ");
		Cards.show(deck);
		System.out.println();
		System.out.print("Hand before hit: ");
		Cards.show(phand);
		System.out.println("");

		Cards.hit(deck, phand);
		System.out.print("Deck after hit: ");
		Cards.show(deck);
		System.out.println();
		System.out.print("Hand after hit: ");
		Cards.show(phand);
*/
	}
	
	private static void addCardsToDeck(ArrayList<Cards> deck) {
		deck.add(Cards.card1);
		deck.add(Cards.card2);
		deck.add(Cards.card3);
		deck.add(Cards.card4);
		deck.add(Cards.card5);
		deck.add(Cards.card6);
		deck.add(Cards.card7);
		deck.add(Cards.card8);
		deck.add(Cards.card9);
		deck.add(Cards.card10);
		deck.add(Cards.card11);
	}

	
}
