
public class UMSException extends Exception{

	private static final long serialVersionUID = 1L;
	private AdministrativeStaff respons;

	public UMSException(AdministrativeStaff respons) {
		super();
		this.respons = respons;
	}

	public AdministrativeStaff getRespons() {
		return respons;
	}

	public void setRespons(AdministrativeStaff respons) {
		this.respons = respons;
	}

}
