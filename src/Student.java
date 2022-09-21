
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String inName, int inScore) {
		this.name = inName;
		this.score = inScore;
	}
	
	@Override
	public String toString() {
		return name + " " + score;
	}

	@Override
	public int compareTo(Student o) {
		//if we want to compare scores:
//		if(this.score < o.score) {
//			return -1;
//		}else if(this.score > o.score) {
//			return 1;
//		}else {
//			return 0;
//		}
		
		//if we want to compare names:
		return this.name.compareTo(o.name);
	}

}