import java.util.ArrayList;

public class TeachingAssistant extends AssistingStaff implements CanAssistCourses, CanOverseeExams{
	
	ArrayList<CourseData> courseData = new ArrayList<CourseData>();
	ArrayList<ExamOverseeing> examOverseeing = new ArrayList<ExamOverseeing>();
	ArrayList<CourseAssisting> courseAssisting = new ArrayList<CourseAssisting>();
	
	public TeachingAssistant(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
		
	}

	public TeachingAssistant(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
		
	}
	
	public boolean earnedHisSalary() {
		return false;
	}
	
	public void addCourse(CourseData course) {
		courseData.add(course);
	}

	@Override
	public void addExamOverseeingAssignment(ExamOverseeing assignment) {
		examOverseeing.add(assignment);
		
	}

	@Override
	public void addCourseAssistingAssignment(CourseAssisting assignment) {
		
		courseAssisting.add(assignment);
		
	}
	
}
