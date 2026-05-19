package abstraction;

public abstract class CentralBank {

	abstract void getBankName();
	abstract void getInterestRate();
	
	void moneyExRate() {
		System.out.println("$1 = 150");
		System.out.println("KDD 1 = 16");
		System.out.println("Yen 10 = 10");
	}
}
