package secao06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double primeiroResultado = scanner.nextDouble();
			double segundoResultado = scanner.nextDouble();
			double terceiroResultado = scanner.nextDouble();
			
			double media = (primeiroResultado * 2 + segundoResultado * 3 + terceiroResultado * 5)/10; 
			
			System.out.printf("%.1f%n", media);
		}
		
		scanner.close();

	}

}
