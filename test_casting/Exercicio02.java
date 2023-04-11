package test_casting;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	
	static final double VALOR_DE_PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double area, raio;
		
		System.out.print("Digite o valor do raio: ");
		raio = scanner.nextDouble();
		
		area = VALOR_DE_PI * raio * raio;
		
		System.out.printf("A = %.4f%n", area);
		
		
		scanner.close();
		
	}

}
