package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("hello.txt");
		// Trying to access txt file from the specified location : 
		FileInputStream file1 = new FileInputStream("C:\\Users\\Khuslal\\OneDrive\\Documents\\CmdNotes.txt");
		int data;
		while((data = file.read())!= -1) {
			System.out.print((char)data);
		}
		int data1;
		while((data1 = file1.read())!= -1) {
			System.out.print((char)data1);
		}
		file.close();
		file1.close();
	}
}
