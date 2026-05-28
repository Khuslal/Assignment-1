package filehandling.hospital.patientrecords;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatePatientRecords {
	public static void main(String[] args) throws IOException {
		File file = new File("Patient Records.csv");
		try (FileOutputStream fos = new FileOutputStream(file, true)) {
			// Write the below line only if new file
			if(file.length() == 0) {
				fos.write("ID: , Name: , Address:, Phone:, Case: \n".getBytes());
			}
			fos.write("11, Subekshya Maheshwori, Baneshwor-14 Kathmandu, 9702566618, Bone Fracture\n".getBytes());
			fos.write("12, Rajan Parajuli, Nagarkot-21 Kathmandu, 9804849349, Common Cold\n".getBytes());
			fos.write("13, Dhanraj Sunar, Dillibajar-32 Dhading, 9807569819, Snake Bite\n".getBytes());
			fos.write("14, Sandeep Chaudhary, Putalisadak-7 Kathmandu, 9806449819, Sugar\n".getBytes());
			fos.write("15, Raju Shrestha, Maharajgunj-2 Kathmandu, 9804749819, Food Poisoning\n".getBytes());
		}
	}
}
