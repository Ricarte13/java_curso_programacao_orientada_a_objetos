package application;

import java.util.Locale;
import java.util.Scanner;

import entities02.Product;

public class Program02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scanner.nextLine();
		System.out.print("Price: ");
		product.price = scanner.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = scanner.nextInt();
		product.addQuantity(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = scanner.nextInt();
		product.removeQuantity(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
//		System.out.printf("%s, %.2f, %d%n", product.name, product.price, product.quantity);
		
		scanner.close();

	}

}
