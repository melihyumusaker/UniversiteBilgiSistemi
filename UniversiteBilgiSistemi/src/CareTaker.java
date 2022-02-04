// caretaker en az 3 sýnýfý olacak, sizelarý toplamýý en az 100 metrekareden fazla olacak
public class CareTaker extends MaintanenceStaf{
	
	private LectureHall[] classrooms = new LectureHall[40];
	
	
	public CareTaker(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);
	}
	
	public CareTaker(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	public void addClasroom(LectureHall[] lectureHall) {	
		for(int i = 0;i<lectureHall.length ; i++) 
			classrooms[i] = lectureHall[i];	
	}
	
	public boolean EarnedHisSalary() {
		
		int totalSize = 0;
		
		for(int i = 0 ; i < classrooms.length ; i++) {
			totalSize += classrooms[i].getSize();
		}
		
		if(classrooms.length > 2 && totalSize > 99) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
