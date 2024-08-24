package section3_3.stackexample;

import java.util.LinkedList;

public class LettersStack {

	public static void main(String[] args) {
		
		LinkedList<Character> lettersStk = new LinkedList<>(); 
		
			lettersStk.push('V');
			lettersStk.push('Z');
			lettersStk.push('A');
			lettersStk.push('S');
			lettersStk.push('T');
			lettersStk.push('M');
			lettersStk.push('R');
		
			System.out.println("Linked List: " + lettersStk);
			System.out.println("Tamanho da fila: " + lettersStk.size());
			
			lettersStk.pop();
			System.out.println("Linked List: " + lettersStk);
			System.out.println("Tamanho da fila: " + lettersStk.size());
			
			lettersStk.remove();
			System.out.println("Linked List: " + lettersStk);
			System.out.println("Tamanho da fila: " + lettersStk.size());
	
	
	}
}
