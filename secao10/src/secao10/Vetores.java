package secao10;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = scanner.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
		sum += vect[i];
		}
		
		double avarage = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avarage);
		
		scanner.close();
	}

}
