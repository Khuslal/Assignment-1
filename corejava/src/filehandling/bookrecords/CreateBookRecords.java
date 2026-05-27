package filehandling.bookrecords;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateBookRecords {
	public static void main(String[] args) throws IOException {
		// create file in specified location
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Khuslal\\OneDrive\\Desktop\\BookRecord.txt", true);

		fos.write("\n\nArtificial Intelligence\n".getBytes());
		fos.write("Cyber Law & Professional Ethics\n".getBytes());
		fos.write("Computer Graphics\n".getBytes());
		fos.write("C#\n".getBytes());
		fos.write("Digital Logic\n".getBytes());

		fos.close();

//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Khuslal\\OneDrive\\Desktop\\Student Details.txt", true);
//		fos.write("\nID : 208\n".getBytes());
//		fos.write("Name : Manish Neupane\n".getBytes());
//		fos.write("Grade : C\n".getBytes());
//		fos.write("Marks : 47\n\n".getBytes());
//		
//		fos.close();
	}
}
