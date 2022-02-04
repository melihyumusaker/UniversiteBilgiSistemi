
public class EmeritusProfessor extends TeachingStaff{

	public EmeritusProfessor(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public EmeritusProfessor(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}
	
}
