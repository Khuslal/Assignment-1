package abstraction;

public class ABCBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("ABC Bank");
		
	}

	@Override
	void getInterestRate() {
		System.out.println("20%");
	}
	

}
