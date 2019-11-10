import org.junit.*;

import static org.junit.Assert.*;
import java.util.*;
public class junittest {

	@Before
	
	@Test
	public void test() {
		junit junit = new junit();
		
		int result = junit.calculation(5, 10);
		int result2 = junit.calculation(6, 10);
		assertEquals(15, result);
		assertNotNull(result);
		//assertNull(result);
		assertNotSame(result, result2);
		//assertSame(result, result2);
		
		
	}
}
