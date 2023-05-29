package ex2_stream;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}
	
	@Override
	public String toString() {
		
		return String.format("[%s,%d,%d]",name,ban,totalScore).toString();
	}
	
	@Override
	public int compareTo(Student s) {//성적이 높은순으로 내림차순으로 정렬
		
		return s.totalScore - this.totalScore;
	}
	
}
