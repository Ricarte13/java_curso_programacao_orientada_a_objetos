package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int A, B;
		
		System.out.print("A = ");
		A = scanner.nextInt();

		System.out.print("B = ");
		B = scanner.nextInt();
		
		if ( A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		
		scanner.close();
	}

}
