/**
 * 
 */
package FifthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Fish fish = new Shark();
		fish.sing();
		fish.swim();
		fish.walk();

		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		s.getFishBehaviour();
		s.getFishColor();
		Fish clownfish = new Clownfish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour((FishPatternIF) new SeventhAssignment.Clownfish());
		c.getFishBehaviour();
		c.getFishColor();

		SwimPatternIF d = new Dolphin();
		d.swim();
	}

}
