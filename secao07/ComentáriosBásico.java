package secao07;

import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula as raízes de uma equação do segundo grau

Os valores dos coeficientes devem ser digitados um por linha

  */
public class ComentáriosBásico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double a, b, c, delta;
		
		System.out.print("Digite os valores dos coeficientes: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
	
		delta = b * b - 4 * a * c; // cálculo do valor de delta
		
		scanner.close();
	}

}
