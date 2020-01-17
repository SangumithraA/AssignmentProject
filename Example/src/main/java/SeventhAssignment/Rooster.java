/**
 * 
 */
package SeventhAssignment;

/**
 * @author Sangumithra Ashokan
 *
 */
public class Rooster extends Bird {

	
	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean sing() {
		return false;
	}
}
