package interfaceandabstractquestion;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		SavingAccount s = new SavingAccount("325546000001", 1000);
		System.out.println(s.addInterest());

		CheckingAccount c = new CheckingAccount("325546000001", 1000);
		c.chargeFee();

		scn.close();
	}
}
