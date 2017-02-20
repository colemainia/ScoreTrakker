import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private static String[] file = {"scores.txt", "badscore.txt", "nofile.txt"};

	public void loadDataFromFile(String f) throws FileNotFoundException {
		studentList.clear();
		FileReader file = new FileReader(f);
		Scanner in = new Scanner(file);

		while(in.hasNextLine()) {
			String first = in.next();
			String last = in.next();
			String score = in.next();
			int scoreInt = 0;
			
			try {
				scoreInt = Integer.parseInt(score);
			} catch(NumberFormatException n) {
				System.out.println("Error printing score of " + first + " " + last);
			}

			Student nextStudent = new Student(first, last, scoreInt);
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

	public void processFiles() throws FileNotFoundException {
		for (String fn : ScoreTrakker.file) {
			try {
				loadDataFromFile(fn);
				printInOrder();
			} catch(FileNotFoundException f) {
				System.out.println("File " + fn + " not found");
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException{
		ScoreTrakker test = new ScoreTrakker();
		test.processFiles();
		
	}
}