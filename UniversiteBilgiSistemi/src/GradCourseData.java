import java.util.ArrayList;

public class GradCourseData extends CourseData{

	private ArrayList<Student> gradStudents = new ArrayList<Student>();
	
	public GradCourseData(String courseCode, String courseName) {
		super(courseCode, courseName);
	}
	
	public GradCourseData(String courseCode, String courseName,TeachingStaff instructor) {
		super(courseCode, courseName,instructor);
	}
	
	public GradCourseData(String courseCode, String courseName,TeachingStaff instructor,AssistingStaff[] assistans) {
		super(courseCode, courseName,instructor,assistans);
	}
	
	public void enrollStudent(Student student) {
		
		if(student instanceof GradStudent) {
			 gradStudents.add(student);
		}
	}
	
	/* Yazýlacak daha
	public ArrayList<Student> getPassedStudents(){
		
	}*/
	

		
		
		
}
