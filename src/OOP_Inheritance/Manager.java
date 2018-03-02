package OOP_Inheritance;

public class Manager extends Company {
	private String jobTitle;

	public Manager(String companyName, String location, String jobTitle) {
		super(companyName, location);
		
		this.jobTitle = jobTitle;

	}
	
	private void managerHoliday() {
		System.out.println("Manager is allowed to get 10 payed holidays");
	}
	
	@Override
	public void holiday() {
		super.holiday();
		managerHoliday();
	}
	
	
	public String getJobTitle() {
		return jobTitle;
	}
}
