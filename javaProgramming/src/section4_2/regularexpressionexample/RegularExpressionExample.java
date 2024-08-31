package section4_2.regularexpressionexample;

public class RegularExpressionExample {

	public static void main(String[] args) {
	
		String resposta = "NÃo";
		if (getResposta(resposta)) {
			System.out.println("Esta é uma resposta válida.");
		} else {
			System.out.println("Esta não é uma resposta válida.");
		}
		
		String word = "impar";
		
		if (rhymingWord(word))
			System.out.println(word + " rima com ar.");
		else
			System.out.println(word + " não rima com ar.");
		
		String data = "01/03/1990";
		if (getData(data))
			System.out.println("Data válida");
		else
			System.out.println("Data fora do padrão");
			
	}
	
	public static boolean getResposta(String animal) {
		return animal.matches("[Ss][Ii][Mm]|[Nn][Ãã][Oo]");
	}

	public static boolean rhymingWord(String word) {
		return word.matches("[a-z]*ar");
							//".*ar$"
							//"[a-z]?ar"
							//"[a-z]+ar"
							//"[A-z]*ar"
	}
	
	// 31-08-2024
	// [0-9]{2} / [0-9]{2} /[0-9{(4}

	public static boolean getData(String data) {
		return data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
		
	}
	
}
