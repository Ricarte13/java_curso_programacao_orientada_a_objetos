package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = scanner.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data: %n", i);
			System.out.print("Commom, used or imported (c/u/i)? ");
			char type = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Price: ");
			double price = scanner.nextDouble();
			if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else if(type == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scanner.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else {
				list.add(new Product(name, price));
			}
		}
			System.out.println();
			System.out.println("PRICE TAGS: ");
			for(Product product : list) {
				System.out.println(product.priceTag());
		
			}
		
		
		scanner.close();
	}
}
