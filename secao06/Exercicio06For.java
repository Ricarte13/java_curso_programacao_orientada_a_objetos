package secao06;

import java.util.Scanner;

public class Exercicio06For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 ) {
				System.out.println(i);
			}
		}
					
		scanner.close();

	}

}
