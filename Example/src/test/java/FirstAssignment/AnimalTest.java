package FirstAssignment;
/**
 * 
 */

import org.junit.Before;
import org.junit.Test;

/**
 * @author Sangumithra Ashokan
 *
 */
public class AnimalTest {

	/**
	 * @param args
	 */

	private Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}

}
