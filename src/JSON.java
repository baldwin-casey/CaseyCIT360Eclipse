import org.json.simple.JSONObject;

public class JSON {
   public static List deck = new ArrayList<Object>();
   public static List hand1 = new ArrayList<Object>();
   public static List hand2 = new ArrayList<Object>();
   public static List hand3 = new ArrayList<Object>();
   public static List hand4 = new ArrayList<Object>();
   public static List hand5 = new ArrayList<Object>();
   public static List hand6 = new ArrayList<Object>();
   builddeck();
   drawcards();
	
public static void deck {
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
}

public static void drawcards() {
	//Draw the First card, remove the card from the deck, decrease the size of the deck, add card to hand
    Random firstrandom = new Random();
	int f1 = firstrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand1.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random secondrandom = new Random();
	int s1 = secondrandom.nextInt(count);
	result = deck.get(s).toString();
    hand1.add(handcount++, result);
	deck.remove(s);
	count--;
	
	Random thirdrandom = new Random();
	int f2 = thirdrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand2.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random fourthrandom = new Random();
	int s2 = fourthrandom.nextInt(count);
	result = deck.get(s).toString();
    hand2.add(handcount++, result);
	deck.remove(s);
	count--;
	
	    Random fifthrandom = new Random();
	int f3 = fifthrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand3.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random sixthrandom = new Random();
	int s3 = sixthrandom.nextInt(count);
	result = deck.get(s).toString();
    hand3.add(handcount++, result);
	deck.remove(s);
	count--;
	
	    Random seventhrandom = new Random();
	int f3 = seventhrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand4.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random eigthrandom = new Random();
	int s3 = eighthrandom.nextInt(count);
	result = deck.get(s).toString();
    hand4.add(handcount++, result);
	deck.remove(s);
	count--;
}

 public static void savejson() {
 JSONObject deckjson = new JSONObject();
 deckjson.put(deck.stringify);
 System.out.Println(deckjson.stringify);
 
 JSONObject deckjson = new JSONObject();
 hand1json.put(hand1.stringify);
 System.out.Println(hand1json.stringify);
 }
}