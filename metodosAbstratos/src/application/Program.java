package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = scanner.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Shape #%d data: %n", i);
			System.out.print("Rectangle or Cicle (r/c)? ");
			char ch = scanner.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scanner.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = scanner.nextDouble();
				System.out.print("Height: ");
				double height = scanner.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = scanner.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for(Shape shape : list) {
		System.out.println(String.format("%.2f", shape.area() ));
		}
		scanner.close();

	}

}
