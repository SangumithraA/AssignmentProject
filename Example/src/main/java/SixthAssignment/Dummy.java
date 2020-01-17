/**
 * 
 */
package SixthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		CaterPillar caterpillar = new CaterPillar();
		caterpillar.walk();
		caterpillar.fly();
		
		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSouundBehaviour(new Butterfly());
		
		caterpillar.performAction();

	}

}
