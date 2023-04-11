package test_casting;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero, resultado;
		
		primeiroNumero = scanner.nextInt();
		segundoNumero = scanner.nextInt();
		
		resultado = primeiroNumero += segundoNumero;
		
		System.out.println("Soma = " + resultado);
		
		scanner.close();
	}

}
