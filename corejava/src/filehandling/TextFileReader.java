package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader  {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("Student.txt");
		BufferedReader br = new BufferedReader(file);
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			
		}
		br.close(); // this releases the occupied space of system memory
	}
}
