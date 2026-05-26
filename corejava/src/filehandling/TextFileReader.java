package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader  {
	public static void main(String[] args) throws IOException {
//		FileReader file = new FileReader("Student.txt");
//		BufferedReader br = new BufferedReader(file);
//		String line;
//		while((line = br.readLine()) != null) {
//			System.out.println(line);	
//		}
//		br.close(); // this releases the occupied space of system memory
		
		FileReader file = new FileReader("C:\\Users\\Khuslal\\OneDrive\\Documents\\CommaSeperatedValueExcelData.csv");
		BufferedReader br = new BufferedReader(file);
		String line;
		br.readLine(); //skip header line
		while((line = br.readLine()) != null) {
			String [] values = line.split(",");
			System.out.println("Id : "+values[0]);
			System.out.println(line);
		}
		br.close(); // this releases the occupied space of system memory
	}
}
