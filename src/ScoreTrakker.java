import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public void loadDataFromFile(String f) throws FileNotFoundException {
		FileReader file = new FileReader(f);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String first = in.next();
			String last = in.next();
			int score = in.nextInt();
			
			Student nextStudent = new Student(first, last, score);
			studentList.add(nextStudent);
		}
		in.close();
		
	}
	
	public void printInOrder() {

	}
	
	public void processFiles() {
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.loadDataFromFile("scores.txt");
		System.out.print(scoreTrakker.studentList);
	}
}