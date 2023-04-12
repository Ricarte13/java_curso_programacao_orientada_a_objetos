package secao05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();
				
		if ( numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		scanner.close();
	}

}
