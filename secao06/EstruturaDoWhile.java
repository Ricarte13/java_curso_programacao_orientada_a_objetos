package secao06;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double Celsius = scanner.nextDouble();
			double fahrenheit = 9 * Celsius/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", fahrenheit);
			System.out.print("Deseja repetir (s/n)?");
			resposta = scanner.next().charAt(0);	
		}while (resposta != 'n');
		
		
		scanner.close();

	}

}
