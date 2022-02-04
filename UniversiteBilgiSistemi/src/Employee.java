public class Employee extends Person{

	
	//field
	private String registryNumber;
	private float salary;
	
	//Constructor 
	public Employee(String name,String identityNo, String registryNumber, float salary) {
		super(name, identityNo);
		this.registryNumber = registryNumber;
		this.salary = salary;
	}
	
	public Employee(Person person, String registryNumber, float salary) {
		super(person.getName(), person.getIdentityNo());
		this.registryNumber = registryNumber;
		this.salary = salary;
	}
	
	// getters setters
	public String getRegistryNumber() {
		return registryNumber;
	}
	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public boolean earnedHisSalary(){
		return false;
	}
	
	
	
	
}
