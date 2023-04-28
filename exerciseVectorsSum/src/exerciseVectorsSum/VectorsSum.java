package exerciseVectorsSum;

import java.util.Scanner;

public class VectorsSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("How many values will each vector have? ");
		n = scanner.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Type the vector A values: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Type the vector B values: ");
		for(int i = 0; i < b.length; i++) {
			b[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
	
		}
	
		
		System.out.println("Resultant vector: ");
		
		for(int i = 0; i < c.length; i++) {
			System.out.printf("%d%n", c[i]);
		}
		
		scanner.close();
	}

}
