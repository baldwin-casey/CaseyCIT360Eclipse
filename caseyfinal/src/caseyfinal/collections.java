package caseyfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author cbald
 This program is fueled by mountain dew and pizza rolls
 */
public class collections {
   public static Scanner in = new Scanner(System.in);
   public static int count = 0;
   public static int handcount = 0;
   public static int dealerhandcount = 0;
   public static int playerhandresult = 0;
   public static int dealerresult = 0;
   public static List deck = new ArrayList<Object>();
   public static List hand = new ArrayList<Object>();
   public static List dealerhand = new ArrayList<Object>();
   //These are the patterns that are checked to determine the value of the cards
   public static Pattern p = Pattern.compile("\\d+");
   public static Pattern ace = Pattern.compile("Ace");
   public static Pattern jack = Pattern.compile("Jack");
   public static Pattern queen  = Pattern.compile("Queen");
   public static Pattern king = Pattern.compile("King");
    public static void collection() throws InterruptedException {
    System.out.println("COLLECTIONS!\n");
    System.out.println("This is a card game called Blackjack or 21.\n");
    System.out.println("The objective is to get the number 21. Numbered cards are their own value. Face cards are worth 10, Aces are 11\n");
    Thread.sleep(5000);
    builddeck();
    drawcards();
    dealerdrawcards();
	calculatehand();
	gamemenu();
	gameresult();
	in.close();
   }
   
    public static void builddeck() throws InterruptedException {
    //Need to build the deck and shuffle the cards
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
   Thread.sleep(5000);
   System.out.println(deck.size() + " Cards in the deck");
   Collections.shuffle(deck);
   System.out.println("The deck has been shuffled");
   }
   

public static void drawcards() {
	//Draw the First card, remove the card from the deck, decrease the size of the deck, add card to hand
    Random firstrandom = new Random();
	int f = firstrandom.nextInt(count);
	String result = deck.get(f).toString();
    hand.add(handcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random secondrandom = new Random();
	int s = secondrandom.nextInt(count);
	result = deck.get(s).toString();
    hand.add(handcount++, result);
	deck.remove(s);
	count--;
	
}

public static void dealerdrawcards() {
	//Draw the First card, remove the card from the deck, decrease the size of the deck, add card to hand
    Random random = new Random();
	int f = random.nextInt(count);
	String result = deck.get(f).toString();
    dealerhand.add(dealerhandcount, result);
	deck.remove(f);
	count--;
	
	//Draw the Second Card, remove the card from the deck, decrease the size of the deck, add card to hand
	Random secondrandom = new Random();
	int s = secondrandom.nextInt(count);
	result = deck.get(s).toString();
    dealerhand.add(dealerhandcount++, result);
	deck.remove(s);
	count--;
	
}

public static void calculatehand() {
    int firstvalue = 0;
    int secondvalue = 0; 
        Matcher m = p.matcher(hand.get(0).toString());
        Matcher mace = ace.matcher(hand.get(0).toString());
        Matcher mjack = jack.matcher(hand.get(0).toString());
        Matcher mqueen = queen.matcher(hand.get(0).toString());
        Matcher mking = king.matcher(hand.get(0).toString());
        if (m.find()) {
        firstvalue = Integer.parseInt(m.group(0));
        }
        //I would use a switch statement here, but those don't work for booleans. 
      //I would also love to make this more efficient and less lines of code.
        if (mace.find()) {
        	firstvalue = 11;
        }
        if (mjack.find()) {
        	firstvalue = 10;
        }
        if (mqueen.find()) {
        	firstvalue = 10;
        }
        if (mking.find()) {
        	firstvalue = 10;
        }

        	//SEARCHING
        Matcher m2 = p.matcher(hand.get(1).toString());
        Matcher mace2 = ace.matcher(hand.get(1).toString());
        Matcher mjack2 = jack.matcher(hand.get(1).toString());
        Matcher mqueen2 = queen.matcher(hand.get(1).toString());
        Matcher mking2 = king.matcher(hand.get(1).toString());
        if (m2.find( )) {
        secondvalue = Integer.parseInt(m2.group());
        }
        if (mace2.find()) {
        	secondvalue = 11;
        }
        if (mjack2.find()) {
        	secondvalue = 10;
        }
        if (mqueen2.find()) {
        	secondvalue = 10;
        }
        if (mking2.find()) {
        	secondvalue = 10;
        }

        //Just wait! The dealer needs his cards calculated too! SUCH INEFFICIENT HORROR!
    	//This displays the current score and asks the player to input a choice. 
        int dealerfirstcard = 0;
        int dealersecondcard = 0;
        Matcher mdeal = p.matcher(dealerhand.get(0).toString());
        Matcher mdealace = ace.matcher(dealerhand.get(0).toString());
        Matcher mdealjack = jack.matcher(dealerhand.get(0).toString());
        Matcher mdealqueen = queen.matcher(dealerhand.get(0).toString());
        Matcher mdealking = king.matcher(dealerhand.get(0).toString());
        if (mdeal.find()) {
        dealerfirstcard = Integer.parseInt(mdeal.group(0));
        }
        //I would use a switch statement here, but those don't work for booleans. 
      //I would also love to make this more efficient and less lines of code.
        if (mdealace.find()) {
        	dealerfirstcard = 11;
        }
        if (mdealjack.find()) {
        	dealerfirstcard = 10;
        }
        if (mdealqueen.find()) {
        	dealerfirstcard = 10;
        }
        if (mdealking.find()) {
        	dealerfirstcard = 10;
        }

        	//SEARCHING
        Matcher mdeal2 = p.matcher(dealerhand.get(1).toString());
        Matcher mdealace2 = ace.matcher(dealerhand.get(1).toString());
        Matcher mdealjack2 = jack.matcher(dealerhand.get(1).toString());
        Matcher mdealqueen2 = queen.matcher(dealerhand.get(1).toString());
        Matcher mdealking2 = king.matcher(dealerhand.get(1).toString());
        if (mdeal2.find( )) {
        dealersecondcard = Integer.parseInt(mdeal2.group());
        }
        if (mdealace2.find()) {
        	dealersecondcard = 11;
        }
        if (mdealjack2.find()) {
        	dealersecondcard = 10;
        }
        if (mdealqueen2.find()) {
        	dealersecondcard = 10;
        }
        if (mdealking2.find()) {
        	dealersecondcard = 10;
        }
        
        dealerresult = dealerfirstcard + dealersecondcard;
            playerhandresult = firstvalue + secondvalue;
}
public static void gamemenu() throws InterruptedException {
	if (playerhandresult > 21 || dealerresult > 21) {
		//Moves onto the results if either player is over 21
	}
	else {
	System.out.println("------------------------------------");
	System.out.println("Your hand: ");
	System.out.println(hand.toString());
	System.out.println("For a total of: " + playerhandresult);
	System.out.println("------------------------------------");
	Thread.sleep(3000);
	System.out.println("The dealers hand: ");
	System.out.println(dealerhand.toString());
	System.out.println("For a total of: " + dealerresult);
	System.out.println("------------------------------------");
	Thread.sleep(2000);
	System.out.println("Would you like to [D]raw or [S]tay? ");
	try {
          String choice = in.nextLine();
          switch(choice){
              case "D": 
              drawextracard();
              dealercheck();
              gamemenu();
          break;
              case "S":
              //Returns to main program  
            	  dealercheck();
              break;
        default:
    System.out.println("Enter a vaild selection and try again");
}
          
}
catch (Exception e) {
     System.out.println("ERROR " + e);
}

}
}

public static void drawextracard() throws InterruptedException{
	Random extrarandom = new Random();
	int e = extrarandom.nextInt(count);
	int extracardvalue = 0;
	String result = deck.get(e).toString();
    hand.add(handcount++, result);
	deck.remove(e);
	count--;
    Matcher m = p.matcher(hand.get(handcount - 1).toString());
    Matcher mace = ace.matcher(hand.get(handcount - 1).toString());
    Matcher mjack = jack.matcher(hand.get(handcount - 1).toString());
    Matcher mqueen = queen.matcher(hand.get(handcount - 1).toString());
    Matcher mking = king.matcher(hand.get(handcount - 1).toString());
    if (m.find()) {
    extracardvalue = Integer.parseInt(m.group(0));
    }
    //I would use a switch statement here, but those don't work for booleans. 
  //I would also love to make this more efficient and less lines of code.
    if (mace.find()) {
    	extracardvalue = 11;
    }
    if (mjack.find()) {
    	extracardvalue = 10;
    }
    if (mqueen.find()) {
    	extracardvalue = 10;
    }
    if (mking.find()) {
    	extracardvalue = 10; }
playerhandresult = playerhandresult + extracardvalue;
System.out.println("You drew: " + hand.get(handcount - 1).toString());
System.out.println("Your new score: " + playerhandresult);
Thread.sleep(3000);
}

public static void dealercheck() throws InterruptedException{
	//This tells if the dealer will draw another card.
	//NOW WITH ADVANCED AI!
	if (dealerresult >= 21 || playerhandresult > 21) {
		//No point in drawing cards at this point
		System.out.println("The Dealer will stay");
	}
	else if (dealerresult < 21 && playerhandresult == 21) {
		System.out.println("The Dealer will draw another card");
		Thread.sleep(3000);
		dealerdrawcard();
	}
	else if (dealerresult < playerhandresult) {
		System.out.println("The Dealer will draw another card");
		Thread.sleep(3000);
		dealerdrawcard();
	}
	else {
		System.out.println("The Dealer will stay");
	}
}

public static void dealerdrawcard() throws InterruptedException {
	Random extrarandom = new Random();
	int e = extrarandom.nextInt(count);
	String result = deck.get(e).toString();
    dealerhand.add(dealerhandcount++, result);
	deck.remove(e);
	count--;
	int dealercardvalue = 0;
	Matcher mdeal = p.matcher(dealerhand.get(dealerhandcount - 1).toString());
     Matcher mdealace = ace.matcher(dealerhand.get(dealerhandcount - 1).toString());
     Matcher mdealjack = jack.matcher(dealerhand.get(dealerhandcount - 1).toString());
     Matcher mdealqueen = queen.matcher(dealerhand.get(dealerhandcount - 1).toString());
     Matcher mdealking = king.matcher(dealerhand.get(dealerhandcount - 1).toString());
     if (mdeal.find()) {
    dealercardvalue = Integer.parseInt(mdeal.group(0));
    }
    //I would use a switch statement here, but those don't work for booleans. 
  //I would also love to make this more efficient and less lines of code.
     if (mdealace.find()) {
    	dealercardvalue = 11;
    }
    if (mdealjack.find()) {
    	dealercardvalue = 10;
    }
    if (mdealqueen.find()) {
    	dealercardvalue = 10;
    }
    if (mdealking.find()) {
    	dealercardvalue = 10;
    }
    
    dealerresult = dealerresult + dealercardvalue;
    System.out.println("The Dealer drew: " + dealerhand.get(dealerhandcount - 1).toString());
    System.out.println("The Dealers new score: " + dealerresult);
    Thread.sleep(3000);
    gamemenu();
}

public static void gameresult() throws InterruptedException {
	System.out.println("Final Results");
	System.out.println("--------------------------------");
	System.out.println("You scored: " + playerhandresult);
	System.out.println("The dealer scored: " + dealerresult);
	//This checks for all possible outcomes
	//Just in case both players go over 21
	if (dealerresult > 21 && playerhandresult > 21) {
		System.out.println("It's a tie!");
	}
	//If the dealer gets more than 21!
	else if (dealerresult > 21) {
		System.out.println("You win!");
	}
		
	//The losing results
	else if (dealerresult >= playerhandresult || playerhandresult > 21) {
	System.out.println("You lose!");
	}
	
	else {
		System.out.println("You win!");
	}
}
}