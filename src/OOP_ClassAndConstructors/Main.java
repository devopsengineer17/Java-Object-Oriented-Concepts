package OOP_ClassAndConstructors;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("Karan Marwah", "VCU", "kkm.karandeep@gmail");
		
		System.out.println("I am " + person.getName() + " and I go to " + person.getSchool() +
				". If you have any questions, you can contact me at " + person.getEmail());
	}

}

