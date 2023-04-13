package secao06;

import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = scanner.nextInt();
		
		int soma = 0;
		
		while (x !=0 ) {
			soma = soma + x;
			System.out.print("Digite um número: ");
			x = scanner.nextInt();
		}
		
		System.out.println("Soma = " + soma);
		
		scanner.close();
		
	}

}
