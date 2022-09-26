import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> studentList;
	
	public ScoreTrakker() {
		this.studentList = new ArrayList<Student>();
	}
	
	void loadDataFile(String fileName) throws FileNotFoundException {
		/*
		 * Has a method named loadDataFile() that takes the file name (a String) 
		 * as a parameter. This method reads student data from a file (format described below) 
		 * and stores student objects in the ArrayList.
		 */
		FileReader reader = new FileReader(fileName);
		Scanner in = new Scanner(reader);
		int count = 1;
		while(in.hasNextLine()) {
			String name = in.nextLine();
			if(!in.hasNextLine()) {
				System.out.println("Uh oh");
			}
			int score = Integer.parseInt(in.nextLine());
			Student tempStudent = new Student(name, score);
			studentList.add(tempStudent);
		}
	}
	
	void printInOrder() {
		/*
		 * Has a method named printInOrder() that will sort and print the ArrayList.
		 * You don't need to write a sort method (google to figure this out),
		 * Try to use an iterated for loop (for each), rather than a counter-controlled loop 
		 * (i.e., no for (int i=0; )
		 */
		Collections.sort(this.studentList);
		for (Student currStudent : this.studentList) {
			System.out.println(currStudent);
		}
	}
	
	void processFiles() throws FileNotFoundException {
		/*
		 * For now, this method will:
		 * Call the loadDataFile() method passing in the name of a correctly formatted file ("scores.txt").
		 * Call the printInOrder() method.
		 */
		String fileName = "scores.txt";
		this.loadDataFile(fileName);
		this.printInOrder();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Has a main() method that simply creates a new object of type ScoreTrakker
		 * and calls processFiles().
		 */
		ScoreTrakker scores = new ScoreTrakker(); 
		scores.processFiles();
	}
}
