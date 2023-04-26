package exercicioVetoresSomaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double sum, average;
		
		System.out.print("How many numbers will you type? ");
		int n = scanner.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i <vect.length; i++) {
			System.out.print("type a number: ");
			vect[i] = scanner.nextDouble();
			
		}
		
		sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sum = sum + vect[i];
			
		}
		
		average = sum / n;
		
		System.out.println();
		System.out.print("VALUES: ");
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		
		System.out.printf("%nSum = %.2f%n", sum);
		System.out.printf("Average: %.2f%n", average);
		
		scanner.close();

	}

}
