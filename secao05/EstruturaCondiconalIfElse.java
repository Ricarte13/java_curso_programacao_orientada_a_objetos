package secao05;

import java.util.Scanner;

public class EstruturaCondiconalIfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour;
		System.out.print("Quantas horas? ");
		hour = scanner.nextInt();
		
		if ( hour < 12 ) {
			System.out.println("Bom dia!");
		} 
		else if ( hour < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		scanner.close();
		
	}

}
