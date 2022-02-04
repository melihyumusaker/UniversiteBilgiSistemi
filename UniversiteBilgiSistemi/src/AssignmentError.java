
public class AssignmentError extends UMSException{

	private String asssignmentType;
	private Academics academic;
	
	public AssignmentError(String asssignmentType, Academics academic,AdministrativeStaff respons) {
		super(respons);
		this.asssignmentType = asssignmentType;
		this.academic = academic;
	}

	public String getAsssignmentType() {
		return asssignmentType;
	}

	public void setAsssignmentType(String asssignmentType) {
		this.asssignmentType = asssignmentType;
	}

	public Academics getAcademic() {
		return academic;
	}

	public void setAcademic(Academics academic) {
		this.academic = academic;
	}
	
}
