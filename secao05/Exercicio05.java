package secao05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double codigo, quantidade, valorTotal;
		
		System.out.print("Codigo do produto: ");
		codigo = scanner.nextDouble();
		
		System.out.print("Quantidade do produto: ");
		quantidade = scanner.nextDouble();
		
		if ( codigo == 1) {
			valorTotal = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		else if (codigo == 2) {
			valorTotal = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		else if (codigo == 3) {
			valorTotal = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		else if (codigo == 4) {
			valorTotal = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		else {
			valorTotal = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		scanner.close();

	}

}
