package caseyfinal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random; 

public class queue {
	public static Queue<String> deck = new LinkedList<>();
	public static Queue<String> hand = new LinkedList<>();
	public static void queue() {
		
		builddeck();
		drawcards();
	}
	
	public static void builddeck() {
	 deck.add("2 of Hearts");
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
    deck.add("Ace of Clubs");
    //This element will be added, queues allow duplicate elements
    deck.add("Ace of Clubs");
    //This cast allows to shuffle the deck, but normally a queue is not shuffled. If this line were not here, it would always return a '2 of Hearts'
    //Collections.shuffle((List<?>) deck);
    //System.out.print(deck.toString());
}

	public static void drawcards() {
	    Random firstrandom = new Random();
		int f = firstrandom.nextInt(deck.size());
		//This always returns the 'head' of the queue, which unshuffled would be '2 of Hearts'
		//Also notice that poll does not need to know which to remove, it removes the first element
		String result = deck.poll();
	    hand.add(result);
		//deck.remove();
		String result2 = deck.poll();
		//Notice how this does not remove the element, it simply looks at it
		String peek = deck.peek();
		String element = deck.element();
	    hand.add(result2);
		//deck.remove();
		System.out.println(hand);
		//Notice the first 2 are always missing. We could get a different element, but a queue is meant to use the ifrst one
		System.out.println(deck);
	}
	
}


