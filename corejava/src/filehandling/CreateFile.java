package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	/*
	 * 1. File InputStream : readfile 
	 * 2. File OutputStream : write file
	 */

	public static void main(String[] args) throws IOException {
		// Creating file
		FileOutputStream file = new FileOutputStream("hello.txt");
		// Trying to create txt file in the specified location :
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Khuslal\\OneDrive\\Documents\\CmdNotes.txt");
		// Writing / Inserting data
		file.write("Hello Java".getBytes());
		// Closing file
		file.close();
		file1.close();

		System.out.println("File Created");
	}
}
