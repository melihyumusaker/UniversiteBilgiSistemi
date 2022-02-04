
public class PaySalaryError extends UMSException{

	private Academics academics;
	private String[] causes;
	
	public PaySalaryError(AdministrativeStaff respons, Academics academics, String[] causes) {
		super(respons);
		this.academics = academics;
		this.causes = causes;
	}
	
	public Academics getAcademics() {
		return academics;
	}
	public void setAcademics(Academics academics) {
		this.academics = academics;
	}
	public String[] getCauses() {
		return causes;
	}
	public void setCauses(String[] causes) {
		this.causes = causes;
	}
	
}
