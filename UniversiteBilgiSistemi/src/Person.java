
public class Person {

	private String identityNo;
	private String name;
	
	public Person(String name, String identityNo) throws Exception {
		super();		
		if(name.length() > 50 && name.length() < 10) {
			throw new Exception("Name must be shorter than 50, longer than 10 characters");
		}
		if(identityNo.length() != 9 ) {
			throw new Exception("Identity no must be 9 characters");
		}
		else if(name.length() <= 50 && name.length() >= 10) {
			this.name = name;
		}
		else if(identityNo.length() == 9 ) {
			this.identityNo = identityNo;
		}	
	}
	
	public String getIdentityNo() {
		return identityNo;
	}
	
	public void setIdentityNo(String identityNo) throws Exception {
		if(identityNo.length() != 9 ) {
			throw new Exception("Identity no must be 9 characters");
		}
		else if(identityNo.length() == 9 ) {
			this.identityNo = identityNo;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.length() > 50 && name.length() < 10) {
			throw new Exception("Name must be shorter than 50, longer than 10 characters");
		}
		else {
			this.name = name;
		}
		
	}
	
	
	
}

