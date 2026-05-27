package filehandling.read.studentdetail;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisplayToppersBasedOnMarks {
	public static void main(String[] args) throws IOException, NumberFormatException {
		String path = "C:\\Users\\Khuslal\\OneDrive\\Desktop\\Student Details.txt";
		
		List<String> toppers = new ArrayList<>();
		int maxMarks = Integer.MIN_VALUE;
		
		String currentName = "";
		
		BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				
				// Capture student's name when the line starts with "Name :"
				if(line.startsWith("Name :")) {
					currentName = line.substring(6).trim();
				}
				// Capture marks and evaluate the toppers when the line starts with Marks :
				// using 'else if' instead of 'if' skip unnecessary execution of below code
				// if satisfies "Name :" means false for "Marks :" during the nth loop execution
				else if (line.startsWith("Marks :")) {
					String marksStr = line.substring(7).trim();
					int marks = Integer.parseInt(marksStr);
					
					// Logic to track the highest score
					if(marks > maxMarks) {
						maxMarks = marks;
						toppers.clear(); // found a new highest score, clear previous ones
						toppers.add(currentName);
					}else if(marks == maxMarks) {
						toppers.add(currentName); // handle ties 
					}
				}
			}
			br.close();
			
			// display final result
			if(!toppers.isEmpty()) {
				System.out.println("Highest marks obtained : "+maxMarks);
				System.out.println("Topper(s) : ");
				for(String topper : toppers ) {
					System.out.println("- "+topper);
				}
			}else {
				System.out.println("Data not found");
			}
	}
}
