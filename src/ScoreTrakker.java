import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> studentList;
	
	public void loadDataFromFile(String f) throws FileNotFoundException {
		FileReader file = new FileReader(f);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String name = in.nextLine();
			int score = in.nextInt();
			// Still have to add a way to split name string into first and last name
			
			
			Student nextStudent = new Student(name, score);
			studentList.add(nextStudent);
		}
		
		
	}
	
	public void printInOrder() {
		
	}
	
	public void processFiles() {
		
	}
	
	public static void main(String[] args) {

	}
}
