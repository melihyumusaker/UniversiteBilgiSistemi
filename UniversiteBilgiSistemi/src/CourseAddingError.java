
public class CourseAddingError extends UMSException{

	private String studentType;
	private String courseType;
	
	public CourseAddingError(String studentType, String courseType,AdministrativeStaff respons) {
		super(respons);
		this.studentType = studentType;
		this.courseType = courseType;
	}
	
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	
	
	
	
}
