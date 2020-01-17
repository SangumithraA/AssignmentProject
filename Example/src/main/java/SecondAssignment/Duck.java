/**
 * 
 */
package SecondAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Duck extends Bird{
	
	private FlyPatternIF flyBehaviour;
	private SoundPatternIF soundBehaviour;

	private SwimPatternIF swimBehaviour;


	public void setSwimBehaviour(SwimPatternIF swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}

	public String performSound(){
		return soundBehaviour.sound();
	}

	public String performFly(){
		return flyBehaviour.fly();
	}

	public String performSwim(){
		return swimBehaviour.swim();
	}

	public void setFlyBehaviour(FlyPatternIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setSoundBehaviour(SoundPatternIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}
	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}

}
