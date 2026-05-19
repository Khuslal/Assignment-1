package interfaceandabstractquestion;

public class CheckingAccount extends BankAccount implements FeeCharger {

	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void chargeFee() {
		balance -= 5;
		System.out.println("Current Balance after deducting $5 as withdrawl fee: "+balance);
	}
	
	
}
