package filehandling.bookrecords;

import java.io.FileInputStream;
import java.io.IOException;

public class RetrieveBookRecords {
	public static void main(String[] args) throws IOException {
		// Reading File : BookRecords.txt
		FileInputStream fis = new FileInputStream("C:\\Users\\Khuslal\\OneDrive\\Desktop\\BookRecord.txt");
		int data;
		while((data = fis.read() )!= -1) {
			System.out.print((char)data);
		}
		fis.close();
	}
}
