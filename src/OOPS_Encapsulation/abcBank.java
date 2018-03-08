package OOPS_Encapsulation;

public class abcBank {
	private String name;
	private int accountNumber;
	private int accountBalance;
	private int ssnNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	
	public void deposit (int addMoney) {
		if ( addMoney < 0) {
			System.out.println("Not enough money to deposit");
		}
		else {
			System.out.println("$" + addMoney + " has successfully deposited to your account");
		}
	}
	
	public int remainingBalance() {
		return this.accountBalance;
	}

}
