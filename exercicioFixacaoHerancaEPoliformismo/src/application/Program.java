package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = scanner.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			System.out.print("Individual or company (i/c)? ");
			char ch = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = scanner.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = scanner.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = scanner.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
				
		}
		
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0.0;
		for( TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			sum += taxPayer.tax();
			
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		scanner.close();

	}

}
