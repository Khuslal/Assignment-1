package employeepayrollsystem;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Select an option :");
		System.out.println("1. Insert Employee Details");
		System.out.println("2. Fetch Employee Details");
		System.out.println("3. Update Employee Details");
		System.out.println("4. Delete/Remove Employee ");
		
		int option = scn.nextInt();
		StoreEmployeeDetails sed = new StoreEmployeeDetails();
		switch (option) {
		case 1:
			sed.storeEmployeeRecords();
			break;
		case 2:
			sed.fetchEmployeeRecords();
			break;
		case 3:
			sed.updateEmployeeRecords();
			break;
		case 4:
			sed.deleteEmployee();
			break;
		default :
			System.out.println("Invalid Choice!");
		}
		scn.close();
	}
}
