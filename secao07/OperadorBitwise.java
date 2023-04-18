package secao07;

import java.util.Scanner;

public class OperadorBitwise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		scanner.close();

	}

}
