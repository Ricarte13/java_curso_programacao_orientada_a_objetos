package exerciseVectorsEvenNumbers;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, evenNumbers;
		
		System.out.print("How many numbers will you type? ");
		n = scanner.nextInt();
		int[] vector = new int[n];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Type a number: ");
			vector[i] = scanner.nextInt();
		}
		
		System.out.println("\nEven numbers: ");
		
		evenNumbers = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] % 2 == 0) {
				System.out.printf("%d ", vector[i]);
				evenNumbers++;
			}
		}
		
				System.out.printf("\n\nEven quantity: %d%n", evenNumbers);
		
		
		scanner.close();

	}

}
