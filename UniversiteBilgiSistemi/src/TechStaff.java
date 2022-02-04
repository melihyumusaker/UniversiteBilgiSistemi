
public class TechStaff extends Employee {


	public TechStaff(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public TechStaff(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public void addAssignment(String assignment) {
		
	}
	
}
