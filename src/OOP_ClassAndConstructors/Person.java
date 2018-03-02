package OOP_ClassAndConstructors;

public class Person {
	private String name;
	private String school;
	private String email;
	
	public Person(String name, String school, String email) {
		this.name = name;
		this.school = school;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	public String getEmail() {
		return email;
	}

}