/**
 * 
 */
package FifthAssignment;

import org.junit.Test;

import FifthAssignment.Clownfish;
import FifthAssignment.Dolphin;
import FifthAssignment.Fish;
import FifthAssignment.FishPatternIF;
import FifthAssignment.Shark;
import FifthAssignment.SharkBehaviour;
import FifthAssignment.SwimPatternIF;
import junit.framework.Assert;

/**
 * @author Sangumithra Ashokan
 *
 */
public class FishTest {
	
	@Test
	public void testFishTest(){
		Fish shark = new Shark();
		Assert.assertEquals("Sharks don’t sing", shark.sing());
		Assert.assertEquals("Sharks can swim",shark.swim());
		Assert.assertEquals("Sharks don't walk",shark.walk());

		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		s.getFishBehaviour();
		Assert.assertEquals("Sharks are large and grey color",s.getFishColor());

		Fish clownfish = new Clownfish();
		Assert.assertEquals("Clownfish don’t sing",clownfish.sing());
		Assert.assertEquals("Clownfish can swim",clownfish.swim());
		Assert.assertEquals("Clownfish don't walk",clownfish.walk());

		Clownfish c = new Clownfish();
		c.setFishBehaviour((FishPatternIF) new Clownfish());
		Assert.assertEquals("Clownfish make jokes",c.getFishBehaviour());
		Assert.assertEquals("Clownfish are small and colorful",c.getFishColor());

		SwimPatternIF d = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",d.swim());
	}



}
