
public class UnderGradStudent extends Student{
	
	public UnderGradStudent(String student_number , String name, int enrollment_year,String identityNo) {
		super(student_number, name,enrollment_year , identityNo);			
	}


	public void addCourse(UnderGradCourseData[] undergradcoursedata) {
		for(int i = 0; i<undergradcoursedata.length ; i++) {
			takenCourses[i] = undergradcoursedata[i];	
		}
		
		
	
}
}
