package exerciseVectorsPeopleData;

import java.util.Locale;
import java.util.Scanner;

public class PeopleData {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n, menQuantity;
		double greatestHeight, shortestHeight, 
		averageWomenHeights, sum, womenHeight;
		
		System.out.print("How many people will be typed? ");
		n = scanner.nextInt();
		
		double[] height = new double[n];
		char[] gender = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%dº person height: ", i + 1);
			height[i] = scanner.nextDouble();
			System.out.printf("%dº person gender: ", i + 1);
			gender[i] = scanner.next().charAt(0);
		}
		
		shortestHeight = height[0];
		for(int i = 0; i < n; i++) {
			if(height[i] < shortestHeight) {
				shortestHeight = height[i] ;
			}
		}
		
		greatestHeight = height[0];
		for(int i = 0; i < n; i++) {
			if(height[i] > greatestHeight) {
				greatestHeight = height[i];
			}
		}
		sum = 0.0;
		womenHeight = 0.0;
		for(int i = 0; i < n; i++) {
			if(gender[i] == 'F') {
				sum += height[i];
				womenHeight++;	
			
			}	
		}
		menQuantity = 0;
		averageWomenHeights = 0.0;
		for(int i = 0; i < n; i++) {
			if(gender[i] == 'F') {
			averageWomenHeights = sum / womenHeight;
			}
			else {
				menQuantity++;
			}
		}	
		
		System.out.printf("Shortest height: %.2f%n", shortestHeight);
		
		System.out.printf("Greatest height: %.2f%n", greatestHeight);
		
		System.out.printf("Avarege women heights: %.2f%n", averageWomenHeights);
		
		System.out.printf("Men quantity: %d%n", menQuantity);
		
		
		
		scanner.close();

	}

}
