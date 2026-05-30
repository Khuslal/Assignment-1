package bankaccountmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Operations {

	private Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/BankAccountManagementSystem", "root",
				"password");
	}

	// account creation
	void createAccount() {
		try {
			Connection conn = getConnection();
			Scanner scn = new Scanner(System.in);

			System.out.println("Creating New Account : ");

			System.out.println("Name : ");
			String name = scn.nextLine();

			System.out.println("Choose Account Type : ");
			System.out.println("1. Saving Account");
			System.out.println("2. Current Account");
			System.out.println("3. Fixed Deposit Account");
			System.out.println("4. Foreign Account");

			int accType = scn.nextInt();
			String accountType = "Saving";

			switch (accType) {
			case 1: {

				accountType = "Saving";
				break;
			}
			case 2: {

				accountType = "Current";
				break;
			}
			case 3: {

				accountType = "Fixed";
				break;
			}
			case 4: {

				accountType = "Foreign";
				break;
			}
			default:
				System.out.println("Account type not matched.");
			}
			// accountType value from switch case:
			String aType = accountType;

			System.out.println("Balance : ");
			double balance = scn.nextDouble();

			String data = "insert into bankaccountdetail (accountName, accountType, balance) values (?, ?, ? )";
			// PreparedStatement.RETURN_GENERATED_KEYS is used here to instantly fetch the
			// account data
			PreparedStatement pstmt = conn.prepareStatement(data, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, name);
			pstmt.setString(2, aType);
			pstmt.setDouble(3, balance);

			int rowsInserted = pstmt.executeUpdate();
			if (rowsInserted > 0) {
				ResultSet rs = pstmt.getGeneratedKeys();

				if (rs.next()) {
					long generatedAccNum = rs.getLong(1);
					System.out.println("Account is created successfully.");
					System.out.println("Account Name   : " + name);
					System.out.println("Account Number : " + generatedAccNum);
					System.out.println("Available Balance : " + balance);
				}
			}
			scn.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// withdraw
	void withdraw(String accountNumber) {
		try {
			Connection conn = getConnection();
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter amount to withdraw : ");
			double withdrawBalance = scn.nextDouble();
			String query = "select * from bankaccountdetail where accountNumber = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, accountNumber);
			ResultSet rs = stmt.executeQuery();
			double db_balance = 0;
			while (rs.next()) {
				db_balance = rs.getDouble("balance");
			}

			if (db_balance > withdrawBalance) {
				double w_new_bal = db_balance - withdrawBalance;

				String data = "update bankaccountdetail set balance = ? where accountNumber = ?";
				PreparedStatement pstmt = conn.prepareStatement(data);
				pstmt.setDouble(1, w_new_bal);
				pstmt.setString(2, accountNumber);
				pstmt.executeUpdate();
				System.out.println("Withdrawn Rs. "+withdrawBalance+" New Balance: "+w_new_bal);
			} else {
				System.out.println("Insufficient Balance!");
			}
			scn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// deposit
	void deposit(String accountNum) {
		try {
			Connection conn = getConnection();
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter amount to deposit : ");
			double depositBalance = scn.nextDouble();
			String query = "select * from bankaccountdetail where accountNumber = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, accountNum);
			ResultSet rs = stmt.executeQuery();
			double db_balance = 0;
			while (rs.next()) {
				db_balance = rs.getDouble("balance");
			}

			if (db_balance > 0) {
				double d_new_bal = db_balance + depositBalance;

				String data = "update bankaccountdetail set balance = ? where accountNumber = ?";
				PreparedStatement pstmt = conn.prepareStatement(data);
				pstmt.setDouble(1, d_new_bal);
				pstmt.setString(2, accountNum);
				pstmt.executeUpdate();
			} else {
				System.out.println("Can't deposit specified amount!");
			}
			scn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
