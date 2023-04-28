package exerciseBelowAverage;

import java.util.Locale;
import java.util.Scanner;

public class BelowAvarage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double sum, vectorAvarage;
		
		System.out.print("How many elements will the vector have? ");
		n = scanner.nextInt();
		double[] vector = new double[n];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Type a number: ");
			vector[i] = scanner.nextDouble();
			
		}
		
		sum = 0.0;
		for(int i = 0; i < vector.length; i++) {
			sum += vector[i];
			
		}
		vectorAvarage = sum / n;
		
		System.out.println();
		System.out.printf("Vector Avarage: %.3f%n ", vectorAvarage);
		
		System.out.println("Elements below average: ");
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < vectorAvarage) {
				System.out.println(vector[i]);
			}
		}
		scanner.close();
	}

}
