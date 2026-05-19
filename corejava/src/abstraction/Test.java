package abstraction;

public class Test {
	public static void main(String[] args) {
		CentralBank bank = new ABCBank();
		bank.getBankName();
		bank.getInterestRate();
		
		UserService us = new UserServiceImpl();
		us.addUser();
		us.deleteUser();
		us.print();
		
		// CommonService cs = new UserServiceImpl();
		// cs.print();
	}
}
