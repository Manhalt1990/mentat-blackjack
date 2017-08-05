import java.util.ArrayList;

public class Hand {

	private ArrayList<Cards> hand;
	
	public Hand(ArrayList<Cards> hand) {
		this.hand = hand;
	}
	
	public void Show() {
		Cards.show(GetHand());
	}
	
	public ArrayList<Cards> GetHand(){
		return this.hand;
	}
}
