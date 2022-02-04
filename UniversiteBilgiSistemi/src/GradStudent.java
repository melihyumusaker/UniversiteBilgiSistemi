
public class GradStudent extends Student{
	
	
	public GradStudent(String student_number , String name, int enrollment_year,String identityNo) {
		super(student_number, name,enrollment_year , identityNo);		
	}

	public void addCourse(GradCourseData[] gradcoursedata) {
		for(int i = 0; i<gradcoursedata.length ; i++) {
			takenCourses[i] = gradcoursedata[i];	
		}
						
	}
	
}
