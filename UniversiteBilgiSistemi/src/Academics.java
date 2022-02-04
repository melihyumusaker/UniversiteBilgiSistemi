
public class Academics extends Employee{

	private CourseData[] courses = new CourseData[40];
	
	
	public Academics(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);	
	}	
	
	public Academics(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);		
	}
	
	public CourseData[] getCourses() {
		return courses;
	}

	public void setCourses(CourseData[] courses) {
		this.courses = courses;
	}
	
	public void addCourse(CourseData[] course) {
		for(int i = 0;i<course.length ; i++) 
			courses[i] = course[i];	
	}

	
	
	

}
