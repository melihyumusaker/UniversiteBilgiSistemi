
public class AssistingStaff extends Academics{

	private Lab lab;
	
	public AssistingStaff(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public AssistingStaff(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);
	}

	public Lab getLab() {
		return lab;
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}
	
	


	
	
}
