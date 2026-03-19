package entities;

public class BankAccount {
	
	private int number;
	private String holder;
	private double balance;	

	public BankAccount(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw + 5;
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
			

}
