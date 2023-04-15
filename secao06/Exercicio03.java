package secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Digite o tipo do combustível desejado, 1)Álcool, 2)Gasolina, 3)Diesel: ");
		int tipo = scanner.nextInt();
		
		while ( tipo != 4) {
			if (tipo == 1) {
				alcool =alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = scanner.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álccol: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
				
		scanner.close();

	}

}
