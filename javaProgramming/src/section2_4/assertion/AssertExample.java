package section2_4.assertion;

import java.util.Scanner;

public class AssertExample {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número");
		
		double num = sc.nextDouble();
		
		System.out.println("O número digitado é: " + num);
		
		assert num < 2_147_483_647 : "amigão, digite um valor menor, está estourando o limite";
		
		
		sc.close();
		
		int y = (int) num;
		System.err.println("O número transformado para inteiro é: " + y);
	}
	

}
