
public class AdministrativeStaff extends Employee{

	public AdministrativeStaff(String name ,String identityNo ,String registryNumber, float salary) {
		super(name ,identityNo , registryNumber, salary);
	}
	
	public AdministrativeStaff(Person person,String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}

	
	
}
