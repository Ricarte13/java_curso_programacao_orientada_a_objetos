package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class ProgramHeight {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		int underSixteen;
		double averageHeight, sum, percentageUnderSixteen;
		System.out.print("How many people will be typed? ");
		int n = scanner.nextInt();
		
		People[] vect = new People[n];
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println((i + 1) + " º person data: ");
			scanner.nextLine();
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			System.out.print("Height: ");
			double height = scanner.nextDouble();
			vect[i] = new People(name, age, height);
		}
		
		underSixteen = 0;
		sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			if( vect[i].getAge() < 16) {
				underSixteen++;
			}
			
			sum += vect[i].getHeight();
		}		
			averageHeight = sum / n;
			percentageUnderSixteen = ((double)underSixteen / n) * 100.0;
		
		System.out.println();
		System.out.printf("Avarege height = %.2f%n",averageHeight);
		System.out.printf("People with less then 16 years old: %.1f %%%n", percentageUnderSixteen);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.printf("%s%n", vect[i].getName());
				
				
			}
		}
		scanner.close();
}
		}
