/**
 * 
 */
package SixthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Butterfly implements FlyPatternIF , SoundPatternIF{

	public String sound() {
		System.out.println("Butterfly can fly");
		return "Butterfly can fly";
	}

	public String fly() {
		System.out.println("Butterfly don't not make a sound");
		return "Butterfly does not make a sound";
	}

}
