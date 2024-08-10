package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

	public static void divide(Scanner sc) throws Exception, InputMismatchException {
		String answer = "SIM";
		double num1 = 0, num2 = 0, result = 0;
		
		do {
		
		try {
		System.out.print("Digite o numerador: ");
		num1 = sc.nextInt();
		System.out.print("Digite o denominador: ");
		num2 = sc.nextInt();
		
		if(num2 == 0) {
			throw new Exception("Divisão por zero!");
		}
		
		} finally {}
		
		
		result = num1 / num2;
		
		System.out.println("O resultado da divisão é: " + result);
		System.out.print("Gostaria de efetuar uma nova divisão? (SIM/NÃO): ");
		answer = sc.nextLine();
		
		while(!answer.equalsIgnoreCase("SIM") && !answer.equalsIgnoreCase("NÃO")) {
			System.out.println("Você precisa digitar SIM ou NÃO");
			answer = sc.next();
		}
		
		} while(answer.equalsIgnoreCase("SIM"));
		
		System.out.println("Programa encerrado!!!");
		
		
		sc.close();
	}
	
	
}
