import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random; 

public class queue {
	public static void queue() {
		builddeck();
		drawcards(builddeck());
	}
	
	public static Queue<String> builddeck() {
Queue<String> deck = new LinkedList<>();
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
    System.out.print(deck.toString());
    return deck;
}

	public static Queue<String> drawcards(Queue<String> deck) {
		Queue<String> hand = new LinkedList<>();
		//None of this code is relevant for queues, just for arraylists. It can be used, but queues are not used in this way.
	    //Random firstrandom = new Random();
		//int f = firstrandom.nextInt(deck.size());
		//This always returns the 'head' of the queue, which unshuffled would be '2 of Hearts'
		String result = deck.element();
	    hand.add(result);
		deck.remove();
		String result2 = deck.element();
	    hand.add(result2);
		deck.remove();
		return hand;
	}
	
}


