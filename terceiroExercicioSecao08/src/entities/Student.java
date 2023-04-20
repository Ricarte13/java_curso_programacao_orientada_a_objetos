package entities;

public class Student {

	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double totalGrade() {
		return firstGrade + secondGrade + thirdGrade;
		}
	public double missingPoints( ) {
		if (totalGrade() > 60) {
			return 0.0;
		}
		else {
			return 60 - totalGrade();
		}
	}
}
