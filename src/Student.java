

public class Student implements Comparable<Student>{
	private String first;
	private String last;
	private int score;
	
	
	Student(String first, String last, int score) {
		this.first = first;
		this.last = last;
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {
		return (last.compareTo(s.last) != 0)? last.compareTo(s.last) : first.compareTo(s.first);
	}

	@Override
	public String toString() {
		return first + " " + last + " " + score;
	}
	
	
}
