package secao06;

import java.util.Scanner;

public class Exercicio04For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			int numerador = scanner.nextInt();
			int denominador = scanner.nextInt();
			
			if ( denominador == 0) {
				System.out.println("Divisão impossível!");
			}
			else {
				double divisao = (double)numerador / denominador;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		scanner.close();

	}

}
