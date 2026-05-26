package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
	/*
	 * 1. FileReader : read
	 * 2. FileWriter : write
	 */
	public static void main(String[] args) throws IOException {
		// writing true just after file name stores the previous data of
		// the file otherwise replace/rewrite all the data 
		FileWriter file = new FileWriter("Student.txt", true);
		file.write("Id : 303\n");
		file.write("Name : Sudip Chhetri\n");
		file.write("Age : 22\n");
		file.write("College : NCC\n");
		file.write("Phone : 9804569814\n\n");
		file.close();
		System.out.println("File Created Successfully");
	}
}
