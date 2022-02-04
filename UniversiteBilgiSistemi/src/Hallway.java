
public class Hallway extends Location{

	public Hallway(String identifier, String address, double size) {
		super(identifier, address, size);
		
	}
	
	public void clean() {
		
	}
	
	public boolean isProperlyMaintaned() {
		return false;
	}
	
}
