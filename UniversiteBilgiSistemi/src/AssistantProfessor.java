
public class AssistantProfessor extends TeachingStaff{

	public AssistantProfessor(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public AssistantProfessor(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}
	
}
