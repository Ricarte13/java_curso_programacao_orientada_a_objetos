package secao05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Hora inicial: ");
		horaInicial = scanner.nextInt();
		
		System.out.print("Hora final: ");
		horaFinal = scanner.nextInt();
		
		if (horaInicial > horaFinal) {
			duracao = -(horaInicial - horaFinal - 24);
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		else if ( horaInicial == horaFinal) {
			duracao = 24;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		else {
			duracao = horaFinal - horaInicial;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		
		scanner.close();
	}

}
