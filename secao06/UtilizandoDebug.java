package secao06;

import java.util.Locale;
import java.util.Scanner;

public class UtilizandoDebug {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.print("Largura: ");
		largura = scanner.nextDouble();
		
		System.out.print("Comprimento: ");
		comprimento = scanner.nextDouble();
		
		System.out.print("metroQuadrado: ");
		metroQuadrado = scanner.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f m² %n", area);
		System.out.printf("Preco = R$ %.2f%n", preco);
		
		scanner.close();

	}

}
