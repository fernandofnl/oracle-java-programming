package section4_1.stringbuildervsstring;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sbr = new StringBuilder("Aprendendo Java com a Oracle");
		
		System.out.println("1. String -> " + sbr);
			
		sbr.reverse();
		System.out.println("2. String reversa -> " + sbr);
		
		sbr.reverse();
		
		sbr.append(" é legal");
		System.out.println("3. Incluindo o texto 'é legal' -> " + sbr);
	
		sbr.delete(11, 16);
		System.out.println("4. Deletando palavra da String -> " + sbr);
		
		sbr.insert(11, "Python ");
		System.out.println("5. Incluindo o novo texto -> " + sbr);
		
		System.out.println("6. Contando o espaço a partir do index -> " + sbr.indexOf(" ", 18));
		
		StringBuilder str = new StringBuilder("10");
		int str1 = Integer.parseInt(str.toString());
		System.out.println(str1 + 3);
		
	}

}
