package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Valor de x: ");
		x = scanner.nextDouble();
		
		System.out.print("Valor de y: ");
		y = scanner.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x != 0 && y == 0) {
			System.out.println("Eixo x");
		}
		else {
			System.out.println("Eixo y");
		}
		scanner.close();
	}

}
