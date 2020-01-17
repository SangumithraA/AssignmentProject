/**
 * 
 */
package FifthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class SharkBehaviour implements FishPatternIF {

	public String color() {
		System.out.println("Sharks are large and grey color");
		return "Sharks are large and grey color";
	}

	public String behaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
