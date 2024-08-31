package section3_3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Criando estudantes
		Student student1 = new Student("Fernando", "Neves", 100);
		Student student2 = new Student("Julio", "Crud", 98);
		Student student3 = new Student("Bruno", "Freire", 45);
		Student student4 = new Student("Lucca", "Silva", 55);
		Student student5 = new Student("Guilherme", "Sampaio", 68);
		Student student6 = new Student("Gustavo", "Hoiti", 21);
		Student student7 = new Student("João Victor", "Alonso", 95);
		
		// Criando lista de estudantes
		ArrayList<Student> lista = new ArrayList();
		lista.add(student1);
		lista.add(student2);
		lista.add(student3);
		lista.add(student4);
		lista.add(student5);
		lista.add(student6);
		lista.add(student7);

		displayLista(lista);
		
		// Classificando a lista de estudantes
		Collections.sort(lista);
		System.out.println();
		
//		String str1 = "Carlos";
//		String str2 = "Djalma";
//		System.out.println(str1.compareTo(str2)); 
		
		displayLista(lista);
			
		
	}
	
	public static void displayLista(ArrayList<Student> lista) {
		for (Student arrTemp : lista) {
			System.out.println(arrTemp);
		}
	}
	

}
