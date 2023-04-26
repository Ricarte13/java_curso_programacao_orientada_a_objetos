package exercicioVetoresNegativos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = scanner.nextInt();
		
		int[] vect = new int[10];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			vect[i] = scanner.nextInt();
		}
		
		System.out.println("Negative numbers: ");
		
		for (int i = 0; i < n; i++) {
			if(vect[i] < 0) {
			System.out.printf("%d%n", vect[i]); 
		}
		
		}
		
		scanner.close();

	}

}
