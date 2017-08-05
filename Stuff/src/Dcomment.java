// Dealer comments for invalid commands.
import java.util.ArrayList;
import java.util.Collections;

public class Dcomment {
	private String comment;

	Dcomment(String comment) {
		this.comment = comment;
	}

	public static Dcomment comment1 = new Dcomment("The dealer looks at you quizzically...");
	static Dcomment comment2 = new Dcomment("The dealer says: \"You slow or something?\"");
	static Dcomment comment3 = new Dcomment(
			"The dealer says: \"We're supposed to stop you from playing if you act drunk. We don't, though.\"");
	static Dcomment comment4 = new Dcomment("The dealer says: \"Whatever, mac. I'm paid by the hour. \"");
	static Dcomment comment5 = new Dcomment("The dealer glances at the pit boss and shrugs... ");
	static Dcomment comment6 = new Dcomment(
			"The dealer says: \"Keep screwing around and the boss'll have your legs broken. \"");
	static Dcomment comment7 = new Dcomment("The player to your right looks at you in annoyance.");

	public static void comment(ArrayList<Dcomment> A) {
		Collections.shuffle(A);
		System.out.println(A.get(0).comment);
	}

}
