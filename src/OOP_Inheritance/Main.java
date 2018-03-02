package OOP_Inheritance;


public class Main {

	public static void main(String[] args) {
		Company company = new Company("ABC Corporation", "Richmond, VA");
		System.out.println("Our company " + company.getCompanyName() + " is located at " + company.getLocation());
		
		
		
		Manager manager = new Manager(null, null, "IT Manager");
		System.out.println("The title of our company's manager is " + manager.getJobTitle());
		manager.holiday();
		
		
		
		regularEmployee employee = new regularEmployee(null, null, "Software Developers");
		System.out.println("Our company has " + employee.getEmployeeJobTitle());
		employee.employeeHoliday();
		
		
		Intern intern = new Intern(null, null, "Interns");
		System.out.println("Our company also has open positions for " + intern.getInternJobTitle());
		intern.internHoliday();
		
	}
}
