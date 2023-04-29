package lacoForEach;

public class LacoForEach {

	public static void main(String[] args) {
		
		String[] name = new String[] {"Maria", "Ana Raquel", "Vinícius"};
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("------------------------------");
		
		for(String list : name) {
			System.out.println(list);
		}
		

		}

}
