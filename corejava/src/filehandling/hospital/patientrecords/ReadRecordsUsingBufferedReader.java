package filehandling.hospital.patientrecords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadRecordsUsingBufferedReader {
	public static void main(String[] args) throws IOException {
		String fileLocation = "Patient Records.csv";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileLocation));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line.replace("Dhanraj Chaudhary", "Ajit Karki"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
