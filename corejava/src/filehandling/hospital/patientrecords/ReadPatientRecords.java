package filehandling.hospital.patientrecords;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadPatientRecords {
	public static void main(String[] args) throws IOException {
		String fileLocation = "Patient Records.csv";
		try (FileInputStream fr = new FileInputStream(fileLocation)) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}
	}
}
