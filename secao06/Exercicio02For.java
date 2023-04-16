package secao06;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		
		int n = scanner.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			
			if ( x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
			
			
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scanner.close();
		
	}

}
