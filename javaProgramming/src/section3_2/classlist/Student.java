package section3_2.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	public static void main(String[] args) {
		
		ArrayList<String> studentNames = new ArrayList<>();		
	
		
		addStudents(studentNames);
		displayStudent(studentNames);
		Collections.sort(studentNames);
		displayStudent(studentNames);
		
	}
	
	private static void addStudents(ArrayList<String> studentNames) {
		
		studentNames.add("Alonso");
		studentNames.add("Bruno");
		studentNames.add("Fernando");
		studentNames.add("Guilherme");
		studentNames.add("Gustavo");
		studentNames.add("Lucca");
		studentNames.add("Julio");
		
	}

	private static void displayStudent(ArrayList<String> studentNames) {
		for (String arrTemp : studentNames) {
			System.out.println(arrTemp);
		}
	}
	
}
