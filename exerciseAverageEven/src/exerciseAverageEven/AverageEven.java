package exerciseAverageEven;

import java.util.Locale;
import java.util.Scanner;

public class AverageEven {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n, sum, evenNumbers;
		double averageEven;
		
		System.out.print("How many elements will the vector have? ");
		n = scanner.nextInt();
		int[] vector = new int[n];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Type a number: ");
			vector[i] = scanner.nextInt();
			
		}
		sum = 0;
		
		evenNumbers = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] % 2 == 0) {
				sum += vector[i];
				evenNumbers++;
			}
		}	
		
		if(evenNumbers == 0) {
			System.out.println("No even numbers!");
		}
		else {	
			averageEven = sum / evenNumbers;
		
			System.out.printf("Even average: %.1f%n", averageEven);
		
		
		}
		
		
		scanner.close();
	}

}
