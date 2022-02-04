import java.util.ArrayList;

public class AssocProfessor extends TeachingStaff implements CanInstructCourses , CanConductResearch{

	ArrayList<CourseInstructing> courseInstructing = new ArrayList<CourseInstructing>();
	ArrayList<Research> addResearch = new ArrayList<Research>();
	
	public AssocProfessor(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public AssocProfessor(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}

	@Override
	public void addResearch(Research research) {
		addResearch.add(research);	
	}

	//2 kez override edeceksin. Birinde parametresiz. Birinde parametreli. evde yap.
	@Override
	public String getResearchInfo() {
		
		return null;
		
	}
	
	

	@Override
	public void addCourseInstructingAssignment(CourseInstructing assignment) {
		courseInstructing.add(assignment);
		
	}
	
}
