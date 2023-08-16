package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Integer> candidate = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = scanner.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int vote = Integer.parseInt(fields[1]);
				
				if(candidate.containsKey(name)) {
					int votesSoFar = candidate.get(name);
					candidate.put(name, vote + votesSoFar);
				}
				else {
					candidate.put(name, vote);
				}
				
				line = br.readLine();
			}
			
			for(String key : candidate.keySet()) {
				System.out.println(key + ": " + candidate.get(key));
			}
			
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			
		scanner.close();

	}

}
