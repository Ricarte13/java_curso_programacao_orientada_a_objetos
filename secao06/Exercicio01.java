package secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a senha de 4 digitos: ");
		int senha = scanner.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			System.out.print("Digite a senha de 4 digitos: ");
			senha = scanner.nextInt();
			
		}
		
		System.out.println("Acesso permitido: " + senha);
		
		scanner.close();
	}

}
