package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guests;

public class ProgramGuest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Guests[] vect = new Guests[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = scanner.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			scanner.nextLine();
			System.out.println();
			System.out.println("Rent #" + i  + ": ");
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Room: ");
			int room = scanner.nextInt();
			vect[room] = new Guests(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);			}
		}
		
		
		
		scanner.close();
	}

}
