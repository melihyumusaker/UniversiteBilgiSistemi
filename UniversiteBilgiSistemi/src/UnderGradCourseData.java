import java.util.ArrayList;

public class UnderGradCourseData extends CourseData{
	
	private ArrayList<Student> underGradStudents = new ArrayList<Student>();

	public UnderGradCourseData(String courseCode, String courseName) {
		super(courseCode, courseName);
	}
	
	public UnderGradCourseData(String courseCode, String courseName,TeachingStaff instructor) {
		super(courseCode, courseName,instructor);
	}
	
	public UnderGradCourseData(String courseCode, String courseName,TeachingStaff instructor,AssistingStaff[] assistans) {
		super(courseCode, courseName,instructor,assistans);
	}
	
	public void enrollStudent(Student student) {
		
		if(student instanceof UnderGradStudent) {
			 underGradStudents.add(student);
		}
	}
	
	/* Yazýlacak daha
	public ArrayList<Student> getPassedStudents(){
		
	}*/
	

	
	
	
	
}
