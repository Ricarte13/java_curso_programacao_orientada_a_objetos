package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		
		
		System.out.println("Enter Client data: ");
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = scanner.next();
		LocalDate birthDate = LocalDate.parse(date, dtf);
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(scanner.next());
		LocalDateTime moment = LocalDateTime.now();
//		System.out.println(dtf1.format(moment));
		Order order = new Order(LocalDateTime.now(), status, client);
		
		
		System.out.print("How many items to this order? ");
		int n = scanner.nextInt();

		
		for(int i = 1; i <= n; i++ ) {
			System.out.printf("Enter #%d item data: %n", i);
			scanner.nextLine();
			System.out.print("Product name: ");
			String productName = scanner.nextLine();
			System.out.print("Product price: ");
			Double productPrice = scanner.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			
			System.out.print("Quantity: ");
			int quantity = scanner.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		
		
		
		
		scanner.close();

	}

}
