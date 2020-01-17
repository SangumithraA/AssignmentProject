/**
 * 
 */
package FourthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Parrot {
	

	//implementing using Composition with abstraction
	/**The composition is another mechanism provided by OOP for reusing implementation.
	composition allows us to model objects that are made up of other objects, 
	thus defining a “has-a” relationship between them. It represents the relationship between two objects*/
	
	private SoundPatternIF soundBehaviour;
	

	public void setSoundBehaviour(SoundPatternIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}


	public String performSound(){
		return soundBehaviour.sound();
	}

}
