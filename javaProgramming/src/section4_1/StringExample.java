package section4_1;

import java.util.ArrayList;

public class StringExample {

	public static void main(String[] args) {
		
		String str = "Um texto qualquer muito grande com muitos espaços";
		String str2 = str.substring(0,2);
		String str3 = str.substring(3,8);
		String str4 = str.substring(9);
		
		System.out.println("===== Usando Split =====");
		String [] lista2 = str.split(" ");
		
		for (String arrTemp : lista2) {
			System.out.println(arrTemp);
		}
		
		System.out.println();
		
		System.out.println("==== Simulando o Split =====");
		parseString(str);
		
		System.out.println();
		System.out.println("===== Usando replace (substituindo caracateres =====");
		String str5 = str.replace(" ", "");
		
		System.out.println(str5);
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(str2);
		lista.add(str3);
		lista.add(str4);
		
		System.out.println();
		System.out.println("===== Print da String =====");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + " ");
		}
		
		System.out.printf("%s %s %s", str2, str3, str4);
		
		System.out.println();
		System.out.println();
		
		System.out.println("Opcao1");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Opcao 2");
		for (char c : str.toCharArray()) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("String invertida");
		for (int j = str.length()-1; j >= 0; j--) {
			System.out.print(str.charAt(j) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		searchChar(str, 'u');
		
	}
	
	public static void searchChar(String str, char c) {
		System.out.println("===== Contando letras =====");
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void parseString(String str) {
		ArrayList<String> list = new ArrayList<>();
		
		while (str.length() > 0) {
			int index = str.indexOf(" ");
			if (index == -1) {
				break;
			}
			list.add(str.substring(0, index));
			str = str.substring(index + 1);
			}
		list.add(str);
		
		for (String arrTemp : list) {
			System.out.println(arrTemp);
		}
		
	}
		
}

