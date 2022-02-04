
public class Restroom extends Location{

	public Restroom(String identifier, String address, double size) {
		super(identifier, address, size);
		
	}
	
	public void clean() {
		
	}
	
	public boolean isProperlyMaintaned() {
		return false;
	}
	
}
