package filehandling.read.csvdataofcustomer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReadCSVdataOfCustomer {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/customerdb";
		String user = "root";
		String password = "password";
		String upload = "insert into customers (id, name, address, phone, product) values (?, ?, ?, ?, ?)";

		try {
			BufferedReader br = new BufferedReader(new FileReader("Customer.csv"));
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(upload);

			String line;
			boolean isHeader = true; // flag to handle csv header row

			while ((line = br.readLine()) != null) {
				// skip first row i.e. id:, name:, address:, phone:, product:
				if (isHeader) {
					isHeader = false;
					continue;
				}
				String[] customers = line.split(",");

				// Map the array elements to your sql query placeholders (?)
				pstmt.setString(1, customers[0].trim()); // id
				pstmt.setString(2, customers[1].trim()); // name
				pstmt.setString(3, customers[2].trim()); // address
				pstmt.setString(4, customers[3].trim()); // phone
				pstmt.setString(5, customers[4].trim()); // product
				pstmt.executeUpdate();
			}
			
			System.out.println("Data Stored Successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
