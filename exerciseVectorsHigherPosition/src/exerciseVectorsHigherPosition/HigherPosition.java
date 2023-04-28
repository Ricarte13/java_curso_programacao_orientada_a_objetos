package exerciseVectorsHigherPosition;

import java.util.Locale;
import java.util.Scanner;

public class HigherPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double higher;
		int n, higherPosition;
		
		System.out.print("How many numbers will you type? ");
		n = scanner.nextInt();
		
		
		double[] vector = new double[n];
		
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Type a number: ");
			vector[i] = scanner.nextDouble();
		}
		higher = 0.0;
		higherPosition = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] > higher) {
				higher = vector[i];
				higherPosition = i;
			}
		}
		
		System.out.println();
		System.out.printf("Highest value: %.1f%n", higher);	
		System.out.printf("Position off the biggest: %d%n", higherPosition);
		
		scanner.close();

	}

}
