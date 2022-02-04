
public class MscStudent extends GradStudent{
	
	public MscStudent(String student_number , String name, int enrollment_year,String identityNo) {
		super(student_number, name,enrollment_year , identityNo);		
	}
	
	
	public boolean checkGraduation(GradCourseData[] gradCourseData) {
		
		int totalCredit=0;
		for(int i = 0;i< gradCourseData.length;i++) {
			totalCredit += gradCourseData[i].getCredit();
		}
		
		if(totalCredit == 45 ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

	
}
