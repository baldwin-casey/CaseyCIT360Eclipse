package caseyfinal;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;


public class trees {
	public static TreeMap<String, String> deck = new TreeMap<>();
	public static TreeMap<String, String> hand = new TreeMap<>();
	public static void trees() {
		buildtree();
		drawcards();
	}

	public static void buildtree() {
deck.put("firstcard", "King of Spades");
deck.put("secondcard", "Ace of Spades");
deck.put("thirdcard", "Queen of Spades");
deck.put("fourthcard", "Jack of Spades");
System.out.println("The deck size is: " + deck.size());
//Notice that the key is sorted alphabetically, the output is sorted based on the key, not the value
//This tree can be sorted by value, but requires extra coding to achieve
System.out.println(deck);
System.out.println("Notice that the key is sorted alphabetically, the output is sorted based on the key, not the value");
	}
	
	
	public static void drawcards() {
		//Yes, we need to build an array to select the correct element from the tree. Not effiecient, but workable. This key is a copy of the deck
		List key = new ArrayList<Object>(deck.values());
		//This line manually adds a card to the hand, this is not practical, as strings are not randomized "cleanly"
		//hand.put("firstdeckcard", deck.get("firstcard"));
		int handcount = 0;
	    Random firstrandom = new Random();
		int f = firstrandom.nextInt(key.size());
		String result = key.get(f).toString();
	    hand.put(Integer.toString(handcount), result);
	    handcount++;
	    System.out.println(hand);
	}
}
