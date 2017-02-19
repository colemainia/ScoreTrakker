

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	Student() {
		name = "";
		score = 0;
	}
	
	Student(String s, int i) {
		name = s;
		score = i;
	}

	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return name + " " + score;
	}
	
	
}
