import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<String> errorLogs = new ArrayList<String>();
		
		GradStudent gradStudent = new GradStudent("191180088", "feyda", 2018,"1");
		UnderGradStudent underGradStudent = new UnderGradStudent("191180087", "koray", 2020,"2");
		
		Student s1 = new Student("191180089","melih",2019,"3");				
		Student s2 = new Student("191180090","doruk",2019,"4");	
		
		MscStudent masterStudent1 = new MscStudent("191180080", "enes", 2020,"5");
		MscStudent masterStudent2 = new MscStudent("191180084", "dilay", 2020,"6");
		
		PhdStudent phdStudent1 = new PhdStudent("191180070", "tayfun", 2019,"7");
		PhdStudent phdStudent2 = new PhdStudent("191180071", "mehmet", 2014,"8");
		PhdStudent phdStudent3 = new PhdStudent("191180072", "yasin", 2019,"9");
		
		CourseData course1 = new CourseData("1","Mat",91);
		CourseData course2 = new CourseData("2","Fizik",5);
		CourseData course3 = new CourseData("3","Biyoloji",4);
		CourseData course20 = new CourseData("20","Tarih",52);
		CourseData course21 = new CourseData("21","Cografya",40);						
		
		GradCourseData course4 = new GradCourseData("4","Mat2",10);
		GradCourseData course5 = new GradCourseData("5","Fizik2",10);
		GradCourseData course6 = new GradCourseData("6","Biyoloji2",25);
		GradCourseData course97= new GradCourseData("30","Tarih2",4);
		GradCourseData course98 = new GradCourseData("32","Cografya2",90);
		GradCourseData course99 = new GradCourseData("33","Müzik2",10);
				
		UnderGradCourseData course7 = new UnderGradCourseData("7","Mat3",25);
		UnderGradCourseData course8 = new UnderGradCourseData("8","Fizik3",55);
		UnderGradCourseData course9 = new UnderGradCourseData("9","Biyoloji3",20);
		UnderGradCourseData course10 = new UnderGradCourseData("10","Tarih3",22);
		UnderGradCourseData course11 = new UnderGradCourseData("11","Coðrafya3",5);
		
		
		CourseData[] dizi = {course1,course2,course3};
		CourseData[] dizi3 = {course20,course21,course2};
		
		CourseData[] dizi2 = {course7,course8,course9};
		CourseData[] dizi4 = {course10,course11,course9};		
		GradCourseData[] dizi1 = {course4,course5,course6};
		GradCourseData[] dizi0 = {course97,course98};
		GradCourseData[] dizi5 = {course4,course98};
		GradCourseData[] dizi6 = {course4,course97};
		GradCourseData[] dizi7 = {course99,course98};	
		
		//Add Course					
		s1.addCourse(dizi2);					
		s2.addCourse(dizi4);	
		masterStudent1.addCourse(dizi1);
		masterStudent2.addCourse(dizi0);
		phdStudent1.addCourse(dizi5);
		phdStudent2.addCourse(dizi6);
		phdStudent3.addCourse(dizi7); 
		
		//check Course
		System.out.println(s1.checkCourse(dizi[0].getCourseName(),"Mat"));
		System.out.println(s1.checkCourse(dizi[2].getCourseName(),"Fizik"));
		
		//Set course Grade
		s1.setCourseGrade(course1, "40");
		s1.setCourseGrade(course2, "50");
		s1.setCourseGrade(course3, "100");
		
		//getGDA
		System.out.println("Öðrenci Ortalamasý " + s1.getGDA(dizi));
		
		//Total Kredi Hesaplama
		System.out.println("Toplam Ders Kredisi "+s1.totalCredit(dizi) + "\n\n");
		
		
		/*  		ÖDEV 		*/
		
		//Grad'e ders ekleme		
		if(dizi1[0] instanceof GradCourseData) {
			gradStudent.addCourse(dizi1);	
			System.out.println("Ders Baþarýyla Eklenmiþtir.");
		}
		else System.out.println("Yolladýðýnýz eleman Yüksek Lisans Öðrencisi Deðildir");
				
		//UnderGrad'e ders ekleme
		if(dizi2[0] instanceof UnderGradCourseData) {
			underGradStudent.addCourse(dizi2);			
			System.out.println("Ders Baþarýyla Eklenmiþtir.");
		}
		else System.out.println("Yolladýðýnýz eleman Lisans Öðrencisi Deðildir");
				
		//Grade kurs ekleyememe
		if(dizi[0] instanceof GradCourseData) gradStudent.addCourse(dizi1);	
		else System.out.println("Yolladýðýnýz eleman Yüksek Lisans Öðrencisi Deðildir");
				
		//UnderGrad'e kurs ekleyememe
		if(dizi[0] instanceof UnderGradCourseData) 	underGradStudent.addCourse(dizi2);	
		else System.out.println("Yolladýðýnýz eleman Lisans Öðrencisi Deðildir\n\n");
		
		
		// Gönderilen dizilerdeki elemanlar student classýna giriyor o yüzden for döngüsüyla baþaramadým checklemeyi
		Student[] checkGraduationStudent = {s1,s2};
		GradStudent[] checkGraduationStudent2 = {masterStudent1,masterStudent2,phdStudent1,phdStudent2,phdStudent3};
		CourseData[][] courseArrayArray = {dizi2,dizi4,dizi1,dizi0,dizi5,dizi6,dizi7}; 
		
		for(int i = 0 ; i < 7; i++) {
			
			if(i == 0 || i ==1) {
				System.out.println(checkGraduationStudent[i].getName() + " Adlý Öðrencinin Mezun Olma Durumu " + checkGraduationStudent[i].checkGraduation(courseArrayArray[i]));
			}
			else if(i==2 || i==3 || i==4 || i==5 || i==6 ) {
				System.out.println(checkGraduationStudent2[i-2].getName() + " Adlý Öðrencinin Mezun Olma Durumu " + checkGraduationStudent2[i-2].checkGraduation(courseArrayArray[i]));
			}
			
		} 	
			
				
		System.out.println("\n\n");
		
		//Lisans Mezun Kontrol
		System.out.println("Lisans öðrencisinin mezun olma durumu " + s1.checkGraduation(dizi2));
		System.out.println("Lisans öðrencisinin mezun olma durumu " + s2.checkGraduation(dizi4) + "\n");		
		//Master öðrenci mezun olma durumu
		System.out.println("Master öðrencisinin mezun Olma Durumu " + masterStudent1.checkGraduation(dizi1)); 
		System.out.println("Master öðrencisinin mezun Olma Durumu " + masterStudent2.checkGraduation(dizi0) );
		//Doktora öðrenci mezun olma durumu		
		System.out.println("Doktora öðrencisinin mezun Olma Durumu " + phdStudent1.checkGraduation(dizi5)); // ders ve kredþi tutuyor
		System.out.println("Doktora öðrencisinin mezun Olma Durumu " + phdStudent2.checkGraduation(dizi6)); // ders alýnmýþ ama kredi tutmuyor 
		System.out.println("Doktora öðrencisinin mezun Olma Durumu " + phdStudent3.checkGraduation(dizi7)); // kredi tutuyor ama ders tutmuyor 
		
			
		
		
	}

}


