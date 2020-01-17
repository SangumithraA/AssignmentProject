/**
 * 
 */
package ThirdAssignment;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author Sangumithra Ashokan
 *
 */
public class RoosterTest {
	@Test
	public void testRoosterTest(){
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",rooster.performFly());
		
		rooster.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.performSound());
		
		rooster.walk();
	}
}
