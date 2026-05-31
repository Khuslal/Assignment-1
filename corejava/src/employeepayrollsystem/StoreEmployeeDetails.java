package employeepayrollsystem;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StoreEmployeeDetails extends EmployeeDetails {
	// Store Data In Database
	void storeEmployeeRecords() {
		try (Scanner scn = new Scanner(System.in)) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeepayrollsystem";
			String user = "root";
			String password = "password";
			Connection conn = DriverManager.getConnection(url, user, password);
			String query = "insert into employee (name, department, basicSalary, allowance, totalSalary) values (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			System.out.println("Enter Name");
			setName(scn.nextLine());

			System.out.println("Select Department");
			System.out.println("1. IT");
			System.out.println("2. Sales");
			System.out.println("3. Marketing");
			System.out.println("4. Finance");
			int option = Integer.parseInt(scn.nextLine());

			switch (option) {
			case 1:
				setDepartment("IT");
				break;
			case 2:
				setDepartment("Sales");
				break;
			case 3:
				setDepartment("Marketing");
				break;
			case 4:
				setDepartment("Finance");
				break;
			default:
				System.out.println("Invalid Command. Please Select Appropriate Option");

			}

			System.out.println("Enter Basic Salary");
			setBasicSalary(Double.parseDouble(scn.nextLine()));

			System.out.println("Enter Allowance");
			setAllowance(Double.parseDouble(scn.nextLine()));

			pstmt.setString(1, getName());
			pstmt.setString(2, getDepartment());
			pstmt.setDouble(3, getBasicSalary());
			pstmt.setDouble(4, getAllowance());
			pstmt.setDouble(5, totalSalary());
			pstmt.executeUpdate();
			System.out.println("Data stored successfully in database.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Retrieve Data From Database
	void fetchEmployeeRecords() {
		try (Scanner scn = new Scanner(System.in)) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeepayrollsystem";
			String user = "root";
			String password = "password";
			Connection conn = DriverManager.getConnection(url, user, password);
			String query = "select * from employee where name = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			System.out.println("Enter Employee Full Name: ");
			String fetchUser = scn.nextLine();
			pstmt.setString(1, fetchUser);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("ID : " + rs.getInt("id"));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Department : " + rs.getString("department"));
				System.out.println("Basic Salary : " + rs.getDouble("basicSalary"));
				System.out.println("Allowance : " + rs.getDouble("allowance"));
				System.out.println("Total Salary : " + rs.getDouble("totalSalary"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Update Data From Database
	void updateEmployeeRecords() {
		try (Scanner scn = new Scanner(System.in)) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeepayrollsystem";
			String user = "root";
			String password = "password";
			Connection conn = DriverManager.getConnection(url, user, password);
			String query = "update employee set basicSalary = ?, allowance = ?, totalSalary = ? where name = ? and id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			System.out.println("Enter Employee Full Name: ");
			String targetUser = scn.nextLine();
			pstmt.setString(4, targetUser);

			System.out.println("Enter Employee ID To Confirm: ");
			int targetId = Integer.parseInt(scn.nextLine());
			pstmt.setInt(5, targetId);

			System.out.println("Enter new basic salary: ");
			setBasicSalary(Double.parseDouble(scn.nextLine()));
			pstmt.setDouble(1, getBasicSalary());

			System.out.println("Enter new allowance : ");
			setAllowance(Double.parseDouble(scn.nextLine()));
			pstmt.setDouble(2, getAllowance());

			pstmt.setDouble(3, totalSalary());

			pstmt.executeUpdate();
			System.out.println("Employee details updated successfully.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Delete Employee From Database
	void deleteEmployee() {
		try (Scanner scn = new Scanner(System.in)) {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employeepayrollsystem";
			String user = "root";
			String password = "password";
			Connection conn = DriverManager.getConnection(url, user, password);
			String query = "delete from employee where name = ? and id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);

			System.out.println("Enter Employee Full Name To Delete: ");
			String targetUser = scn.nextLine();
			pstmt.setString(1, targetUser);

			System.out.println("Enter ID To Confirm: ");
			int id = Integer.parseInt(scn.nextLine());
			pstmt.setDouble(2, id);
			System.out.println(
					"Employee: " + targetUser + " with id: " + id + " has been deleted successfully from database.");
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
