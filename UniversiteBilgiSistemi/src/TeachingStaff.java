
public class TeachingStaff extends Academics{

	private String officeHours;
	private Office office;
	
	public TeachingStaff(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public TeachingStaff(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	
	public void addCourse(CourseData course) {
		
	}
	
}
