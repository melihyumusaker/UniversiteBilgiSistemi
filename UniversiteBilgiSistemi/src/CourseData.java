import java.util.ArrayList;

public class CourseData {
	
	
	private String courseCode;
	private String courseName;
	private TeachingStaff instructor;
	private AssistingStaff[] assistans = new AssistingStaff[40];
	private ArrayList<Student> students = new ArrayList<Student>();
	private int credit;
	
	
	public CourseData(String courseCode, String courseName) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public CourseData(String courseCode, String courseName, TeachingStaff instructor) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
	}

	public CourseData(String courseCode, String courseName, TeachingStaff instructor, AssistingStaff[] assistans) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.instructor = instructor;
		this.assistans = assistans;
	}
	
	public void enrollStudent(Student student) {
		students.add(student);
	}
	
	/* Yazýlacak daha
	public ArrayList<Student> getPassedStudents(){
		
	}*/
	
	
	

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public TeachingStaff getInstructor() {
		return instructor;
	}
	public void setInstructor(TeachingStaff instructor) {
		this.instructor = instructor;
	}
	public AssistingStaff[] getAssistans() {
		return assistans;
	}
	public void setAssistans(AssistingStaff[] assistans) {
		this.assistans = assistans;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	

	
	
	

}
