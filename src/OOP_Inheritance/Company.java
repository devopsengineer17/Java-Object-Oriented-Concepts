package OOP_Inheritance;

public class Company {
	private String companyName;
	private String location;
	
	
	public Company(String companyName, String location) {
		this.companyName = companyName;
		this.location = location;
		
	}
	
	
	public void holiday() {
		System.out.println("Every employee of the company will be given holidays");
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getLocation() {
		return location;
	}

}
