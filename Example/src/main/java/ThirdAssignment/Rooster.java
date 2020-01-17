/**
 * 
 */
package ThirdAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Rooster extends Bird {
	
	private SoundPatternIF soundBehaviour;
	private FlyPatternIF flyBehaviour;
	public void setSoundBehaviour(SoundPatternIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void setFlyBehaviour(FlyPatternIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	
	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}


}
