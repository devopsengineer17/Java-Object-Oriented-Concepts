package OOP_Inheritance;

public class regularEmployee extends Company{
	private String employeeJobTitle;
	
	public regularEmployee(String companyName, String location, String employeeJobTitle) {
		super(companyName, location);
		
		this.employeeJobTitle = employeeJobTitle;
	}
	
	public void employeeHoliday() {
		System.out.println("Regular employees are allowed to get 5 payed holidays");
	}
	
	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}

}

