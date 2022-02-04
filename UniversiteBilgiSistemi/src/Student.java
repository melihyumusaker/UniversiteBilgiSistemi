
public class Student extends Person{

	private String studentNumber;
	private int enrollmentYear;
	private CourseData[] takenCourses = new CourseData[40];
	

	public Student(String name, String identityNo, String studentNumber, int enrollmentYear) throws Exception {
		super(name, identityNo);

		if(studentNumber.length() != 9) {
			throw new Exception("Student Number must be 9 characters");
		}
		
		else {
			this.studentNumber = studentNumber;
		}
		if(enrollmentYear < 2000 && enrollmentYear > 2022) {
			throw new Exception("Enrollment year must be 2000-2022");
		}
		else if(enrollmentYear >= 2000 && enrollmentYear <= 2022) {
			this.enrollmentYear = enrollmentYear;
		}
		
	}	

	public String getStudent_number() {
		return studentNumber;
	}

	public void setStudent_number(String studentNumber) throws Exception {
		if(studentNumber.length() != 9) {
			throw new Exception("Student Number must be 9 characters");
		}
		
		else {
			this.studentNumber = studentNumber;
		}
		
	}

	public int getEnrollment_year() {
		return enrollmentYear;
	}

	public void setEnrollment_year(int enrollmentYear) throws Exception {
		if(enrollmentYear < 2000 && enrollmentYear > 2022) {
			throw new Exception("Enrollment year must be 2000-2022");
		}
		else if(enrollmentYear >= 2000 && enrollmentYear <= 2022) {
			this.enrollmentYear = enrollmentYear;
		}
	}

	public CourseData[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(CourseData[] takenCourses) {
		this.takenCourses = takenCourses;
	}

	public void addCourse(CourseData[] coursedata) {
		for(int i = 0;i<coursedata.length ; i++) 
			takenCourses[i] = coursedata[i];				
	}
	
	public boolean checkCourse(String courseName,String searchName) {		
		if(courseName == searchName) return true;					
		else return false;								
	}		
		
		private int totalCredit = 0;
	public int getTotalCredit(CourseData[] courseData) {
		
		for(int i = 0;i < courseData.length;i++) {			
			 totalCredit +=  courseData[i].getCredit();
		}
		return totalCredit;
	}
	
	public boolean checkGraduation(CourseData[] courseData) {
		int totalCredit = 0;
		
		for(int i = 0;i< courseData.length;i++) totalCredit += courseData[i].getCredit(); //toplam kredi hesaplama			
					
		if(totalCredit==100) return true;
		else return false;	
		
	}


	
	
	
	
	
	
}
