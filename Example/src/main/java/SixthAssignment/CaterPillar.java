/**
 * 
 */
package SixthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class CaterPillar extends Animal implements FlyPatternIF {
	
	private FlyPatternIF flyBehaviour;
	
	private SoundPatternIF souundBehaviour;

	public void setFlyBehaviour(FlyPatternIF flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setSouundBehaviour(SoundPatternIF souundBehaviour) {
		this.souundBehaviour = souundBehaviour;
	}

	
	public void performAction(){
		  flyBehaviour.fly();
		  souundBehaviour.sound();
		}

		public String fly() {
			System.out.println("Caterpillar can not fly");
			return "Caterpillar can not fly";
		}
}
