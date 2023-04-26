package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = scanner.next().charAt(0);
		
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scanner.nextDouble();
			 account = new Account(accountNumber, holder, initialDeposit);
			
		}
		else {
		account = new Account(accountNumber, holder);
			
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");	
		double deposit = scanner.nextDouble();
		account.addDeposit(deposit);
		System.out.println("Update acocunt data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");	
		double withdraw = scanner.nextDouble();
		account.removeDeposit(withdraw);
		System.out.println("Update acocunt data: ");
		System.out.println(account);
		
		scanner.close();

	}

}
