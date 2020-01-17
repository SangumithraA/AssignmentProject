/**
 * 
 */
package FifthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class ClownFishBehaviour implements FishPatternIF{

	public String color() {
		System.out.println("Clownfish are small and colorful");
		return "Clownfish are small and colorful";
	}

	public String behaviour() {
		System.out.println("Clownfish make jokes");
		return "Clownfish make jokes";
	}

}
