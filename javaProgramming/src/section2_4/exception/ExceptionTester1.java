package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		
		} catch(InputMismatchException | NumberFormatException e) { // coloco o | para acrescentar exceções ou uso um catch
			System.out.println("DIGITE UM VALOR NUMERICO!!");
			sc.nextLine();
			continue;
		
		} /*catch(NumberFormatException e) {
			System.out.println("O formato do número não está adequado");
			sc.nextLine();
			continue;			
			
		}*/ catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Digite um valor válido.");
			sc.nextLine();
			continue;
		
		} /*finally {
			num1 = 100;
			num2 = 15;
		}*/
		
		
		
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
