
public class LabTechnitian extends TechStaff{

	
	Lab[] labs = new Lab[40];
	
	public LabTechnitian(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);
	}
	
	public LabTechnitian(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public void addLab(Lab[] lab) {
		for(int i = 0;i<lab.length ; i++) 
			labs[i] = lab[i];
	}
	
	public boolean earnedHisSalary() {
		return false;
	}

}
