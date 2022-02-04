/*
public class Instructor extends Employee{
	// Instructor en az 12 kredi ders verecek en az 4 ders verecek en az 1 undergrad ve en az 1 grad course verecek ... earnedhissalary ture dönecek
	

	
	//field
	private String instructor_name;
	CourseData[] givenCourses = new CourseData[40];
	
	//Constructor
	public Instructor(String registryNumber, int salary, String instructor_name) {
		super(registryNumber, salary);
		this.instructor_name = instructor_name;
	}
	
	//get set
	public String getInstructor_name() {
		return instructor_name;
	}
	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}
	
	//functions
	public void addCourse(CourseData[] coursedata) {
		for(int i = 0;i<coursedata.length ; i++) 
			givenCourses[i] = coursedata[i];				
	}
	
	public boolean EarnedHisSalary() {
		
		int totalCredit = 0;
		boolean checkGradCourse = false;
		boolean checkUnderGradCourse = false;
		
		for(int i = 0 ; i < givenCourses.length;i++) {
			totalCredit += givenCourses[i].getCredit();
		}
		
		for(int i = 0 ; i < givenCourses.length ; i++) {
			if(givenCourses[i] instanceof GradCourseData) {
				checkGradCourse = true;
			}
		}
		for(int i = 0 ; i < givenCourses.length ; i++) {
			if(givenCourses[i] instanceof UnderGradCourseData) {
				checkUnderGradCourse = true;
			}
		}
		
		if( (totalCredit > 11) && (givenCourses.length > 3) && checkGradCourse && checkUnderGradCourse ) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	
	
}
*/