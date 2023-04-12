package secao05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = scanner.nextInt();
		
		if ( numero < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		scanner.close();

	}

}
