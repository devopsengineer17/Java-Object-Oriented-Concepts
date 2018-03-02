package OOP_Inheritance;

public class Intern extends Company{
	private String internJobTitle;
	
	public Intern(String companyName, String location, String internJobTitle) {
		super(companyName, location);
		
		this.internJobTitle = internJobTitle;
	}
	
	public void internHoliday() {
		System.out.println("Interns are allowed to get 3 payed holidays");
	}
	
	public String getInternJobTitle() {
		return internJobTitle;
	}

}
