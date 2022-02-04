
public class MaintanenceStaf extends Employee{

	private Location[] responsibilityArray = new Location[40];

	public MaintanenceStaf(String name, String identityNo, String registryNumber,float salary) {
		super(name,identityNo, registryNumber, salary);		
	}
	
	public MaintanenceStaf(Person person, String registryNumber,float salary) {
		super(person, registryNumber, salary);		
	}

	public Location[] getResponsibilityArray() {
		return responsibilityArray;
	}

	public void setResponsibilityArray(Location[] responsibilityArray) {
		this.responsibilityArray = responsibilityArray;
	}
	
	public void addResponsibility(Location[] location) {
		
	}
	
	
	
}
