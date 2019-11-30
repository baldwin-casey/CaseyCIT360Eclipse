package caseyfinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class set {
	public static HashSet deck = new HashSet<String>();
	public static HashSet hand = new HashSet<String>();
	public static List deck2 = new ArrayList<Object>();
	public static void set() {

		createset();
		displayset();
	}
	
	public static void createset() {
	 /*deck.add("2 of Hearts");
    deck.add("3 of Hearts");
    deck.add("4 of Hearts");
    deck.add("5 of Hearts");
    deck.add("6 of Hearts");
    deck.add("7 of Hearts");
    deck.add("8 of Hearts");
    deck.add("9 of Hearts");
    deck.add("10 of Hearts");
    deck.add("Jack of Hearts");
    deck.add("Queen of Hearts");
    deck.add("King of Hearts");
    deck.add("Ace of Hearts");
    deck.add("2 of Diamonds");
    deck.add("3 of Diamonds");
    deck.add("4 of Diamonds");
    deck.add("5 of Diamonds");
    deck.add("6 of Diamonds");
    deck.add("7 of Diamonds");
    deck.add("8 of Diamonds");
    deck.add("9 of Diamonds");
    deck.add("10 of Diamonds");
    deck.add("Jack of Diamonds");
    deck.add("Queen of Diamonds");
    deck.add("King of Diamonds");
    deck.add("Ace of Diamonds");
    deck.add("2 of Spades");
    deck.add("3 of Spades");
    deck.add("4 of Spades");
    deck.add("5 of Spades");
    deck.add("6 of Spades");
    deck.add("7 of Spades");
    deck.add("8 of Spades");
    deck.add("9 of Spades");
    deck.add("10 of Spades");
    deck.add("Jack of Spades");
    deck.add("Queen of Spades");
    deck.add("King of Spades");
    deck.add("Ace of Spades");
    deck.add("2 of Clubs");
    deck.add("3 of Clubs");
    deck.add("4 of Clubs");
    deck.add("5 of Clubs");
    deck.add("6 of Clubs");
    deck.add("7 of Clubs");
    deck.add("8 of Clubs");
    deck.add("9 of Clubs");
    deck.add("10 of Clubs");
    deck.add("Jack of Clubs");
    deck.add("Queen of Clubs");
    deck.add("King of Clubs");
    */
    deck.add("Ace of Clubs");
    //This extra element will not be added
    deck.add("Ace of Clubs");
    
    //This is the arraylist to compare against
    int count = 0;
    deck2.add(count, "2 of Hearts");
    deck2.add(count++, "3 of Hearts");
    deck2.add(count++, "4 of Hearts");
    deck2.add(count++, "5 of Hearts");
    deck2.add(count++, "6 of Hearts");
    deck2.add(count++, "7 of Hearts");
    deck2.add(count++, "8 of Hearts");
    deck2.add(count++, "9 of Hearts");
    deck2.add(count++, "10 of Hearts");
    deck2.add(count++, "Jack of Hearts");
    deck2.add(count++, "Queen of Hearts");
    deck2.add(count++, "King of Hearts");
    deck2.add(count++, "Ace of Hearts");
    deck2.add(count++, "2 of Diamonds");
    deck2.add(count++, "3 of Diamonds");
    deck2.add(count++, "4 of Diamonds");
    deck2.add(count++, "5 of Diamonds");
    deck2.add(count++, "6 of Diamonds");
    deck2.add(count++, "7 of Diamonds");
    deck2.add(count++, "8 of Diamonds");
    deck2.add(count++, "9 of Diamonds");
    deck2.add(count++, "10 of Diamonds");
    deck2.add(count++, "Jack of Diamonds");
    deck2.add(count++, "Queen of Diamonds");
    deck2.add(count++, "King of Diamonds");
    deck2.add(count++, "Ace of Diamonds");
    deck2.add(count++, "2 of Spades");
    deck2.add(count++, "3 of Spades");
    deck2.add(count++, "4 of Spades");
    deck2.add(count++, "5 of Spades");
    deck2.add(count++, "6 of Spades");
    deck2.add(count++, "7 of Spades");
    deck2.add(count++, "8 of Spades");
    deck2.add(count++, "9 of Spades");
    deck2.add(count++, "10 of Spades");
    deck2.add(count++, "Jack of Spades");
    deck2.add(count++, "Queen of Spades");
    deck2.add(count++, "King of Spades");
    deck2.add(count++, "Ace of Spades");
    deck2.add(count++, "2 of Clubs");
    deck2.add(count++, "3 of Clubs");
    deck2.add(count++, "4 of Clubs");
    deck2.add(count++, "5 of Clubs");
    deck2.add(count++, "6 of Clubs");
    deck2.add(count++, "7 of Clubs");
    deck2.add(count++, "8 of Clubs");
    deck2.add(count++, "9 of Clubs");
    deck2.add(count++, "10 of Clubs");
    deck2.add(count++, "Jack of Clubs");
    deck2.add(count++, "Queen of Clubs");
    deck2.add(count++, "King of Clubs");
    deck2.add(count++, "Ace of Clubs");
	}

	public static void displayset() {
		//Collections.shuffle(deck);
	    Random firstrandom = new Random();
		int f = firstrandom.nextInt(deck.size());
		boolean result = deck.contains("Ace of Clubs");
	    hand.add(result);
		deck.remove(f);
		System.out.println(hand.toString());
	}
	
}

