package bankaccountmanagementsystem;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Operations op = new Operations();
		// Switch Case :
		System.out.println("Select Operation: ");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Create Account");
		Scanner scn = new Scanner(System.in);
		int option = Integer.parseInt(scn.nextLine());
		switch(option) {
		case 1: 
			System.out.println("Enter Account Number : ");
			String accoutNumber = scn.nextLine();
			op.withdraw(accoutNumber);
			break;
		case 2:
			System.out.println("Enter Account Number : ");
			String accountNum = scn.nextLine();
			op.deposit(accountNum);
			break;
		case 3:
			op.createAccount();
			break;
		default :
			System.out.println("Invalid Choice!");
		}
		scn.close();
	}
}
