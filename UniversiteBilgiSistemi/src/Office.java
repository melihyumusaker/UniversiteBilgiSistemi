
public class Office extends Location {

	public Office(String identifier, String address, double size) {
		super(identifier, address, size);
		
	}
	
	public void clean() {
		
	}
	
	public boolean isProperlyMaintaned() {
		return false;
	}
	
}
