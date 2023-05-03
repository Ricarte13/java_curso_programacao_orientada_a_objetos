package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n; 
		
		List<Employees> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		n = scanner.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.printf("Employee #%d: %n", i);
			System.out.print("Id: ");
			Integer id = scanner.nextInt();
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			Double salary = scanner.nextDouble();
			
			Employees employees = new Employees(id, name, salary);
			
			list.add(employees);

		}
	System.out.println();
	System.out.print("Enter the emplyee id that will have salary increase: ");
	int idSalary = scanner.nextInt();
	Integer position = position(list, idSalary);
		if(position == null) {
			System.out.println("This id does not exist!");
			}
			else { 
				System.out.println();
				System.out.print("Enter the percentage: ");
				double percent = scanner.nextDouble();
				list.get(position).increaseSalary(percent);
				
			}
		
	System.out.println();
	System.out.println("List of employees: ");
	for(Employees employees : list) {
		System.out.println(employees);
	}
		scanner.close();

	}
	

	
	public static Integer position(List<Employees> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
		
	}

}
