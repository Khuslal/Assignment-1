package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		System.out.println("hello.txt exits : "+file.exists());
		
		File f = new File("user.txt");
		System.out.println("user.txt exists : "+f.exists());
		
		File dir = new File("mydir");
		dir.mkdir();
		System.out.println("mydir exists "+dir.exists());
		
		// get all file names from the folder
		String [] fileNames = dir.list();
		System.out.println(Arrays.toString(fileNames));
		System.out.println(fileNames.length);
		
		// read all files from folder
		File[] files = dir.listFiles();
		for(File x : files) {
//			Files.readString(Path.of(x.getAbsolutePath()));
			System.out.println(Files.readString(Path.of(x.getAbsolutePath())));
		}
	}
}
