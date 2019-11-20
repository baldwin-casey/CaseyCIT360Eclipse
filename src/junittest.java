import org.junit.*;

import static org.junit.Assert.*;
import java.util.*;
public class junittest {

	@Before
	@Test
	public void test() throws Exception {
		junit junit = new junit();
		
		int result = junit.calculation(5, 10);
		int result2 = junit.calculation(6, 10);
		assertEquals(15, result);
		assertNotNull(result);
		//This one fails
		//assertNull(result);
		assertNotSame(result, result2);
		//This one also fails
		//assertSame(result, result2);
		
		//Does the deck load properly?
		Queue<String> testqueue = queue.builddeck();
		assertNotNull(testqueue);
		//assertNull(testqueue);
		Queue<String> testhand = queue.drawcards(queue.builddeck());
		//This will fail and display the contents of the hand
		//assertNull(testhand);
		assertEquals(testhand.toString(), "[2 of Hearts, 3 of Hearts]");
		
		List arraylistdeck = collections.deck;
		List arraylistdeck2 = collections.deck;
		assertArrayEquals(arraylistdeck.toArray(), arraylistdeck.toArray() );
	}
}
