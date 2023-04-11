package test_casting;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
//		String texto;
//		texto = scanner.next();
//		System.out.println(texto);
//		
//		int numero;
//		numero = scanner.nextInt();
//		System.out.println(numero);

//		double numeroFlutuante;
//		numeroFlutuante = scanner.nextDouble();
//		System.out.println(numeroFlutuante);
		
//		char character;
//		character = scanner.next().charAt(0);
//		System.out.println(character);
		
//		String nome;
//		int numero;
//		double numeroFlutuante;
//		nome = scanner.next();
//		numero = scanner.nextInt();
//		numeroFlutuante = scanner.nextDouble();
//		System.out.println("Dados digitados: ");
//		System.out.println(nome);
//		System.out.println(numero);
//		System.out.println(numeroFlutuante);
		
		int numero;
		String texto1, texto2, texto3;
		
		numero = scanner.nextInt();
		scanner.nextLine();
		texto1 = scanner.nextLine();
		texto2 = scanner.nextLine();
		texto3 = scanner.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(numero);
		System.out.println(texto1);
		System.out.println(texto2);
		System.out.println(texto3);
		
		
		
		scanner.close();
		
	}

}
