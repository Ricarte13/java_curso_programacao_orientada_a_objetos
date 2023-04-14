package secao06;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int N = scanner.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			System.out.print("Digite o valor de N: ");
			int x = scanner.nextInt();
			soma = soma + x;
			
		}
				
		System.out.println("A soma é: " + soma);		
		
		scanner.close();

	}

}
