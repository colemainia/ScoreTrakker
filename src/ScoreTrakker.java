import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(studentList);
		
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
	}
	
	public void processFiles(String str) throws FileNotFoundException {
		loadDataFromFile(str);
		printInOrder();
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		ScoreTrakker scoreTrakker = new ScoreTrakker();
		scoreTrakker.processFiles("scores.txt");
	}
}