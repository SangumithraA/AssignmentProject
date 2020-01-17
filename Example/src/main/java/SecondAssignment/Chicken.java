/**
 * 
 */
package SecondAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Chicken extends Bird {
	
	private FlyPatternIF flyBehaviour;
	private SoundPatternIF soundBehaviour;
	private SwimPatternIF swimBehaviour;


	public String performSound(){
		return soundBehaviour.sound();
	}
	public String performFly(){
		return flyBehaviour.fly();
	}

	public String performSwim(){
		return swimBehaviour.swim();
	}

	//setters

	public void setFlyBehaviour(FlyPatternIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundPatternIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	public void setSwimBehaviour(SwimPatternIF swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}

}
