
public class ITGuy extends TechStaff{

	public ITGuy(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public ITGuy(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}

	
	
}
