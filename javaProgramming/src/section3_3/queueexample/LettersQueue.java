package section3_3.queueexample;

import java.util.LinkedList;

public class LettersQueue {

	public static void main(String[] args) {
		
		LinkedList<String> lettersq = new LinkedList<>(); 
		
		lettersq.add("V");
		lettersq.add("Z");
		lettersq.add("A");
		lettersq.add("S");
		lettersq.add("T");
		lettersq.add("M");
		lettersq.add("R");
		lettersq.add("F");
		lettersq.add("D");
		lettersq.add("M");
		lettersq.add("P");
		lettersq.add("B");
		lettersq.add("L");
		lettersq.add("O");
		lettersq.add("H");
		
		System.out.println("Linked List: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		lettersq.remove();
		System.out.println("Linked List: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		lettersq.pop();
		System.out.println("Linked List: " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		
		
	}

}
