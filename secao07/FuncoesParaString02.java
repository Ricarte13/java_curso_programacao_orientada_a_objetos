package secao07;

import java.util.Scanner;

public class FuncoesParaString02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = "potato apple lemon";
		
		String[] vector = s.split(" ");
		
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
		
		scanner.close();

	}

}
