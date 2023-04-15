package secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Digite o valor de x: ");
		x = scanner.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = scanner.nextInt();
		
		while (x != 0 && y!= 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) { 
				System.out.println("segundo");
			
		}
			else if (x < 0 && y < 0) { 
				System.out.println("terceiro");
			
		}
			else {
				System.out.println("Quarto");
			}
			
			System.out.print("Digite o valor de x: ");
			x = scanner.nextInt();
			
			System.out.print("Digite o valor de y: ");
			y = scanner.nextInt();
			
		}	
		
		scanner.close();

	}

}
