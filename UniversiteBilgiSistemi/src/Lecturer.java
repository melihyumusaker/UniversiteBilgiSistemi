import java.util.ArrayList;

public class Lecturer extends TeachingStaff implements CanInstructCourses{
	
	ArrayList<CourseInstructing> canInstructCourses = new ArrayList<CourseInstructing>();
	
	public Lecturer(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
	}
	
	public Lecturer(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public boolean earnedHisSalary() {
		return false;
	}

	@Override
	public void addCourseInstructingAssignment(CourseInstructing assignment) {
		canInstructCourses.add(assignment);
	}

}
