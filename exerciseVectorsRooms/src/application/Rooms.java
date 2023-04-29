package application;

import java.util.Scanner;

import entities.Rent;

public class Rooms {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Rent[] rent = new Rent[10];
		
		int n;
		
		System.out.print("How many rooms will be rented? ");
		n = scanner.nextInt();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d: %n", i);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.next();
			System.out.print("Room: ");
			int room = scanner.nextInt();
			rent[room] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}
		
		scanner.close();

	}

}
