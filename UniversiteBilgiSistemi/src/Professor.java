
public class Professor extends TeachingStaff{

	public Professor(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public Professor(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}
	
}
