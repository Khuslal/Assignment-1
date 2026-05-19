package interfaceandabstractquestion;

public class SavingAccount extends BankAccount{

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	double addInterest() {
		return balance += (balance*0.02);
	}

}
