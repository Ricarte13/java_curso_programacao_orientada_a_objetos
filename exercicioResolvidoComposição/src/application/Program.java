package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String departmentName = scanner.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scanner.nextLine();
		System.out.print("Level: ");
		String workerLevel = scanner.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = scanner.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("Hoe many contracts to this worker? ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Enter contract #%d data: %n", i);
			System.out.print("Date (DD/MM/YYYY): ");
			String date = scanner.next();
			LocalDate contractDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Value per hour: ");
			double valuePerHour = scanner.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = scanner.nextInt();
			worker.addContract(new HourContract(contractDate, valuePerHour, duration));
			
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %d/%d: %.2f%n", month, year, worker.income(month, year));
		
		scanner.close();
	}

}
