package test_casting;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double number, hours, earnPerHour, salary;
		
		System.out.print("Inform the number = ");
		number = scanner.nextDouble();
		
		System.out.print("Inform the hours that you work = ");
		hours = scanner.nextDouble();
		
		System.out.print("Inform how much you earn per hour = ");
		earnPerHour = scanner.nextDouble();
		
		salary = earnPerHour * hours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
	
		
		scanner.close();

	}

}
