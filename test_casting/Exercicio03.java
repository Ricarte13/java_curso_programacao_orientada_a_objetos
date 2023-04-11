package test_casting;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A, B, C, D, DIFERENCA;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		DIFERENCA = A * B - C * D;
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		
		
		
		scanner.close();
		
	}

}
