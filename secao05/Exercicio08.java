package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double renda, impostoDeRenda;
		
		System.out.print("Digite sua renda: ");
		renda = scanner.nextDouble();
		
		if (renda <= 2000.00) {
			System.out.println("Isento");
		}
		else if (renda > 2000.00 && renda < 3000.00) {
			impostoDeRenda = (8 * (renda - 2000.00)) / 100;
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		}
		else if (renda > 3000.00 && renda < 4500.00) {
			impostoDeRenda = ((8 * 1000) / 100) + ((18 * (renda - 3000.00))/100);
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		}
		else {
			impostoDeRenda = ((8 * 1000) / 100) + (18 * (1500)/100 + (28 * (renda - 4500))/100);
			System.out.printf("R$ %.2f%n", impostoDeRenda);
		}
	
		scanner.close();

	}

}
