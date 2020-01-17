/**
 * 
 */
package ThirdAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Invocation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyWithWings());
		rooster.performFly();

		rooster.setSoundBehaviour(new RoosterSound());
		rooster.performSound();
		
		rooster.walk();
	}

}
