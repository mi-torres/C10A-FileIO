
public class ScoreTrakker {
	private ArrayList<Student> studentList;
	
	public ScoreTrakker() {
		this.studentList = new ArrayList<Student>();
	}
	
	void loadDataFile(String fileName) {
		/*
		 * Has a method named loadDataFile() that takes the file name (a String) 
		 * as a parameter. This method reads student data from a file (format described below) 
		 * and stores student objects in the ArrayList.
		 */
	}
	
	void printInOrder() {
		/*
		 * Has a method named printInOrder() that will sort and print the ArrayList.
		 * You don't need to write a sort method (google to figure this out),
		 * Try to use an iterated for loop (for each), rather than a counter-controlled loop 
		 * (i.e., no for (int i=0; )
		 */
		
	}
	
	void processFiles() {
		/*
		 * For now, this method will:
		 * Call the loadDataFile() method passing in the name of a correctly formatted file ("scores.txt").
		 * Call the printInOrder() method.
		 */
	}
	
	public static void main(String[] args) {
		/*
		 * Has a main() method that simply creates a new object of type ScoreTrakker
		 * and calls processFiles().
		 */
		ScoreTrakker scores = new ScoreTrakker(); 
		scores.processFiles();
	}
}
