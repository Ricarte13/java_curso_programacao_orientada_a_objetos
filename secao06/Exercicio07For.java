package secao06;

import java.util.Scanner;

public class Exercicio07For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for ( int i = 1; i <= n; i++) {
			
			int primeiro = i;
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, quadrado, cubo);
		}
		
		scanner.close();

	}

}
