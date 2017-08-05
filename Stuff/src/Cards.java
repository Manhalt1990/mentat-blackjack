import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cards {
	private int value;
	private char suit;
	private String face;
	private static int total;
	public String decision;

	Cards() {
		value = 0;
		suit = 'J';
	}

	Cards(int i, char c, String s) {
		value = i;
		suit = c;
		face = s;
	}

	public int getValue() {
		return value;
	}

	public char getSuit() {
		return suit;
	}

	public String getFace() {
		return face;
	}

	public static int addValues(Cards A, Cards B) {
		int sum = (A.getValue() + B.getValue());
		return sum;
	}

	public static int compare(Cards A, Cards B) {
		if (A.value == B.value) {
			System.out.println("The cards are equal.");
		} else if (A.value > B.value) {
			System.out.println(A.face + " is greater than " + B.face);
		} else if (A.value < B.value) {
			System.out.println(A.face + " is less than " + B.face);
		}
		return 0;
	}

	public static int shuffle(ArrayList<Cards> A) { // Shuffle Method
		Collections.shuffle(A);
		for (int i = 0; i < A.size(); i++) {
			System.out.print(((Cards) A.get(i)).getFace() + " ");
		}
		return 0;
	}

	public static void hit(ArrayList<Cards> A, ArrayList<Cards> B) {
		System.out.println("Hit!");
		Cards hitCard = A.get(0);
		A.remove(0);
		B.add(0, hitCard);
	}

	public static void show(ArrayList<Cards> A) {
		if (A.isEmpty()) {
			System.out.println("Empty");
		} else
			for (int i = 0; i < A.size(); i++) {
				System.out.print(A.get(i).getFace() + " ");
			}
	}

	// attempt to total hand card values
	public static int total(ArrayList<Cards> A) {
		total = 0;
		for (int i = 0; i < A.size(); i++) {
			total += (A.get(i).getValue());
		}
		return total;
	}

	public static void deal(ArrayList<Cards> A, ArrayList<Cards> B, ArrayList<Cards> C) {
		hit(A, B);
		hit(A, C);
		hit(A, B);
		hit(A, C);
	}
	
	static Cards card1 = new Cards(2, 'C', "2C");
	static Cards card2 = new Cards(3, 'C', "3C");
	static Cards card3 = new Cards(4, 'C', "4C");
	static Cards card4 = new Cards(5, 'C', "5C");
	static Cards card5 = new Cards(6, 'C', "6C");
	static Cards card6 = new Cards(7, 'C', "7C");
	static Cards card7 = new Cards(8, 'C', "8C");
	static Cards card8 = new Cards(9, 'C', "9C");
	static Cards card9 = new Cards(10, 'C', "10C");
	static Cards card10 = new Cards(10, 'C', "JC");
	static Cards card11 = new Cards(10, 'C', "QC");

}
