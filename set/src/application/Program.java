package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Users;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = scanner.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<Users> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				String user = fields[0];
				Instant date = Instant.parse(fields[1]);
				
				set.add(new Users(user, date));
				
				line = br.readLine();
				
			}
			
			System.out.println("Total users : " + set.size());
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		scanner.close();

	}

}
