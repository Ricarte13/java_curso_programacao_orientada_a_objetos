package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = scanner.nextLine();
		student.firstGrade = scanner.nextDouble();
		student.secondGrade = scanner.nextDouble();
		student.thirdGrade = scanner.nextDouble();
				
		System.out.printf("FINAL GRADE = %.2f%n ", student.totalGrade());
		
		if (student.totalGrade() > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING = %.2f POINTS%n", student.missingPoints());
		}
		
		
		
		scanner.close();
	}

}
