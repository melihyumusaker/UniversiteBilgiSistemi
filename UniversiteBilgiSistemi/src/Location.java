
public class Location {

	private String identifier;
	private String address;
	private double size;
	
	public Location(String identifier, String address, double size) {
		super();
		this.identifier = identifier;
		this.address = address;
		this.size = size;
	}
	
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	
	public boolean isProperlyMaintaned() {
		 return false;
	}

	
	
}
