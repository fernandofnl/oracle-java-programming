package section4_1.stringbuildervsstring;

public class StringVsBuilder {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder("Teste de imutabilidade.");
		String str = "Teste de imutabilidade.";
		
		System.out.println("Endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Endereço da String: " + str.hashCode());
		
		sbr.replace(0, sbr.length(), "Hello World!");
		str.replace(str, "Hello World!");
		
		System.out.println(sbr);
		System.out.println(str);
		
		System.out.println("Endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Endereço da String: " + str.hashCode());
		
	}

}
