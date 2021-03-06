/**
 * 
 */
package FifthAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Clownfish extends Fish{
	
	private FishPatternIF fishBehaviour;


	
	public void setFishBehaviour(FishPatternIF fishBehaviour) {
		this.fishBehaviour = fishBehaviour;
	}

	@Override
	public String sing() {
		System.out.println("Clownfish don�t sing");
		return "Clownfish don�t sing";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	@Override
	public String walk() {
		System.out.println("Clownfish don't walk");
		return "Clownfish don't walk";
	}
	
	public String getFishColor(){
		return fishBehaviour.color();
	}

	public String getFishBehaviour(){
		return fishBehaviour.behaviour();
	}

}
