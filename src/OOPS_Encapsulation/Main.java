package OOPS_Encapsulation;

public class Main {

	public static void main(String[] args) {

		abcBank bank = new abcBank();
		
		bank.setName("Will");
		bank.setAccountNumber(56567787);
		bank.setAccountBalance(25);
		bank.setSsnNumber(567893456);
		
		bank.deposit(50);
		System.out.println(bank.getName() + " with ssn number " + bank.getSsnNumber() + " has made a new transaction to the account " + bank.getAccountNumber());
		System.out.println("The new account balance is: " + bank.getAccountBalance());
	}
	

}
