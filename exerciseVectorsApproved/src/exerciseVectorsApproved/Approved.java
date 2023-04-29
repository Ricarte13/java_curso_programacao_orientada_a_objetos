package exerciseVectorsApproved;

import java.util.Locale;
import java.util.Scanner;

public class Approved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		double averageGrade;
		
		System.out.print("How many students will be typed: ");
		n = scanner.nextInt();
		
		String[] name = new String[n];
		double[] firstGrade = new double[n];
		double[] secondGrade = new double[n];
		
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("Type name, first and second grade of %dº aluno: %n", i + 1);
			scanner.nextLine();
			name[i] = scanner.nextLine();
			firstGrade[i] = scanner.nextDouble();
			secondGrade[i] = scanner.nextDouble();
		}
		System.out.println("Approved Student: ");
		
		for(int i = 0; i < n; i++) {
			averageGrade = (firstGrade[i] + secondGrade[i]) / 2;
			if(averageGrade >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		scanner.close();

	}

}
