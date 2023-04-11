package test_casting;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.print("A = ");
		A = scanner.nextDouble();
		
		System.out.print("B = ");
		B = scanner.nextDouble();
		
		System.out.print("C = ");
		C = scanner.nextDouble();
		
		 double areaDoTriangulo = (A * C)/2;
		 System.out.printf("TRIÂNGULO: %.3f%n", areaDoTriangulo);
		
		 double areaDoCirculo = 3.14159 * C * C;
		 System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
		 
		 double areaDoTrapezio = (A + B) * C /2;
		 System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);
		 
		 double areaDoQuadrado = B * B;
		 System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		 
		 double areaDoRetangulo = A * B;
		 System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);
		 
		scanner.close();

	}

}
