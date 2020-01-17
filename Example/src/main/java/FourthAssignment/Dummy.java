/**
 * 
 */
package FourthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.setSoundBehaviour(new DogSound());
		parrot.performSound();
		parrot.setSoundBehaviour(new DuckSound());
		parrot.performSound();
		parrot.setSoundBehaviour(new CatSound());
		parrot.performSound();
		parrot.setSoundBehaviour(new RoosterSound());
		parrot.performSound();
		parrot.setSoundBehaviour(new PhoneSound());
		parrot.performSound();

	}

}
