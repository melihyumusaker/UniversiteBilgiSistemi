public class PhdStudent extends GradStudent{
	
	//Constructor
	
	public PhdStudent(String student_number , String name, int enrollment_year,String identityNo) {
		super(student_number, name,enrollment_year , identityNo);		
	}
	
		
	public boolean checkGraduation(GradCourseData[] gradCourseData) {
		
		int totalCredit=0;
		String ders="";
		
		for(int i = 0;i< gradCourseData.length;i++) {
			totalCredit += gradCourseData[i].getCredit();
		}
		
		for(int i = 0 ; i < gradCourseData.length ; i++) {
			
			if(gradCourseData[i].getCourseName() == "Mat2") {
				ders = "Mat2";
			}			
		}
		
		if(totalCredit == 100 &&  ders =="Mat2") {
			System.out.println("\nKredi Tutuyor Ve �stenilen Ders Al�nm��t�r.");
			return true;
		
		}
		else if(totalCredit == 100 && ders != "Mat2") {
			System.out.println("\nKredi Tutuyor Ancak �stenilen Ders Al�nmam��t�r.");
			return false;
		}
		else if(totalCredit != 100 && ders == "Mat2") {
			System.out.println("\n�stenilen Ders Al�nm��t�r Fakat Kredi Tutmuyor.");
			return false;
		}
		else {
			System.out.println("Kredi tutmuyor ve �stenilen Ders Al�nmam��t�r.");
			return false;
		}
		
			
		
			
			
		
		
	}
	
}
