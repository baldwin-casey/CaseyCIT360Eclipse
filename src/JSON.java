import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.json.JSONException;
import org.json.JSONObject;

public class JSON {
	public static int count = 0;
	public static int handcount = 0;
	   public static List deck = new ArrayList<Object>();
	   public static List hand1 = new ArrayList<Object>();
	   public static List hand2 = new ArrayList<Object>();
	   public static List hand3 = new ArrayList<Object>();
	   public static List hand4 = new ArrayList<Object>();
	public static void JSON() {
   builddeck();
   drawcards();
   savejson();
   System.exit(0);
	}
	
public static void builddeck() {
 deck.add(count, "2 of Hearts");
    deck.add(count++, "3 of Hearts");
    deck.add(count++, "4 of Hearts");
    deck.add(count++, "5 of Hearts");
    deck.add(count++, "6 of Hearts");
    deck.add(count++, "7 of Hearts");
    deck.add(count++, "8 of Hearts");
    deck.add(count++, "9 of Hearts");
    deck.add(count++, "10 of Hearts");
    deck.add(count++, "Jack of Hearts");
    deck.add(count++, "Queen of Hearts");
    deck.add(count++, "King of Hearts");
    deck.add(count++, "Ace of Hearts");
    deck.add(count++, "2 of Diamonds");
    deck.add(count++, "3 of Diamonds");
    deck.add(count++, "4 of Diamonds");
    deck.add(count++, "5 of Diamonds");
    deck.add(count++, "6 of Diamonds");
    deck.add(count++, "7 of Diamonds");
    deck.add(count++, "8 of Diamonds");
    deck.add(count++, "9 of Diamonds");
    deck.add(count++, "10 of Diamonds");
    deck.add(count++, "Jack of Diamonds");
    deck.add(count++, "Queen of Diamonds");
    deck.add(count++, "King of Diamonds");
    deck.add(count++, "Ace of Diamonds");
    deck.add(count++, "2 of Spades");
    deck.add(count++, "3 of Spades");
    deck.add(count++, "4 of Spades");
    deck.add(count++, "5 of Spades");
    deck.add(count++, "6 of Spades");
    deck.add(count++, "7 of Spades");
    deck.add(count++, "8 of Spades");
    deck.add(count++, "9 of Spades");
    deck.add(count++, "10 of Spades");
    deck.add(count++, "Jack of Spades");
    deck.add(count++, "Queen of Spades");
    deck.add(count++, "King of Spades");
    deck.add(count++, "Ace of Spades");
    deck.add(count++, "2 of Clubs");
    deck.add(count++, "3 of Clubs");
    deck.add(count++, "4 of Clubs");
    deck.add(count++, "5 of Clubs");
    deck.add(count++, "6 of Clubs");
    deck.add(count++, "7 of Clubs");
    deck.add(count++, "8 of Clubs");
    deck.add(count++, "9 of Clubs");
    deck.add(count++, "10 of Clubs");
    deck.add(count++, "Jack of Clubs");
    deck.add(count++, "Queen of Clubs");
    deck.add(count++, "King of Clubs");
    deck.add(count++, "Ace of Clubs");
    System.out.println("The Unshuffled Deck");
    System.out.println(deck);
    Collections.shuffle(deck);
}

public static void drawcards() {
	//Draw the First card, remove the card from the deck, decrease the size of the deck, add card to hand
    Random firstrandom = new Random();
	int f1 = firstrandom.nextInt(count);
	String result = deck.get(f1).toString();
    hand1.add(0, result);
	deck.remove(f1);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random secondrandom = new Random();
	int s1 = secondrandom.nextInt(count);
	result = deck.get(s1).toString();
    hand1.add(1, result);
	deck.remove(s1);
	count--;
	
	Random thirdrandom = new Random();
	int f2 = thirdrandom.nextInt(count);
	result = deck.get(f2).toString();
    hand2.add(0, result);
	deck.remove(f2);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random fourthrandom = new Random();
	int s2 = fourthrandom.nextInt(count);
	result = deck.get(s2).toString();
    hand2.add(1, result);
	deck.remove(s2);
	count--;
	
	    Random fifthrandom = new Random();
	int f3 = fifthrandom.nextInt(count);
	result = deck.get(f3).toString();
    hand3.add(0, result);
	deck.remove(f3);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random sixthrandom = new Random();
	int s3 = sixthrandom.nextInt(count);
	result = deck.get(s3).toString();
    hand3.add(1, result);
	deck.remove(s3);
	count--;
	
	    Random seventhrandom = new Random();
	int f4 = seventhrandom.nextInt(count);
	result = deck.get(f3).toString();
    hand4.add(0, result);
	deck.remove(f4);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random eighthrandom = new Random();
	int s4 = eighthrandom.nextInt(count);
	result = deck.get(s3).toString();
    hand4.add(1, result);
	deck.remove(s4);
	count--;
}

 public static void savejson() {
 JSONObject deckjson = new JSONObject();
 JSONObject hand1json = new JSONObject();
 JSONObject hand2json = new JSONObject();
 JSONObject hand3json = new JSONObject();
 JSONObject hand4json = new JSONObject();
 try {
	deckjson.put("Deck", deck);
	//For some reason, I can put 3 of the hands into the JSON, but not the fourth. Not sure why.
	hand1json.append("Hand 1", hand1);
	hand2json.append("Hand 2", hand2);
	hand3json.append("Hand 3", hand3);
	hand4json.append("Hand 4", hand4);
} catch (JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 System.out.println(deckjson.toString());
 System.out.println(hand1json.toString());
 System.out.println(hand2json.toString());
 System.out.println(hand3json.toString());
 System.out.println(hand4json.toString());

 
 }
}
