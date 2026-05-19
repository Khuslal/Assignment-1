package interfaceandabstractquestion;

public abstract class BankAccount {
	protected String accountNumber;
	protected double balance;
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
