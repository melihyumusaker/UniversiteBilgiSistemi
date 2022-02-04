import java.util.ArrayList;

public class ResearchAssistant extends AssistingStaff implements CanAssistCourses,CanAssistLabCourses,CanOverseeExams{

	ArrayList<String> addResearch = new ArrayList<String>();
	ArrayList<ExamOverseeing> examOverseeing = new ArrayList<ExamOverseeing>();
	ArrayList<LabCourseAssisting> labCourseAssisting = new ArrayList<LabCourseAssisting>();
	ArrayList<CourseAssisting> courseAssisting = new ArrayList<CourseAssisting>();
	
	public ResearchAssistant(String name, String identityNo, String registryNumber, float salary) {
		super(name, identityNo, registryNumber, salary);
		// TODO Auto-generated constructor stub
	}
	
	public ResearchAssistant(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
		// TODO Auto-generated constructor stub
	}

	public boolean earnedHisSalary() {
		return false;
	}
	
	public void AddResearch(String research) {
		addResearch.add(research);
	}

	@Override
	public void addExamOverseeingAssignment(ExamOverseeing assignment) {
		examOverseeing.add(assignment);
		
	}

	@Override
	public void addLabAssistingAssignment(LabCourseAssisting assignment) {
		
		labCourseAssisting.add(assignment);
	}

	@Override
	public void addCourseAssistingAssignment(CourseAssisting assignment) {
		
		courseAssisting.add(assignment);
		
	}
	
	
}
