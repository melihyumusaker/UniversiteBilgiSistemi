
public class Gardener extends MaintanenceStaf{
	
	public Gardener(String name, String identityNo, String registryNumber, float salary) {
		super(name,identityNo, registryNumber, salary);
	}
	public Gardener(Person person, String registryNumber, float salary) {
		super(person, registryNumber, salary);
	}
	
	

	public void addClasroom(LectureHall[] lectureHall) {	
		
	}
	
	public boolean EarnedHisSalary() {
				
			return false;
		}
		
	

}
