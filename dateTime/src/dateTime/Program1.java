package dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {
		
//		https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-05-04");
		LocalDateTime d05 = LocalDateTime.parse("2023-05-04T01:13:13");
		Instant d06 = Instant.parse("2023-05-04T01:13:13.13Z");
		Instant d07 = Instant.parse("2023-05-04T01:13:13.13-03:00");
		
//		https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
		
		LocalDate d08 = LocalDate.parse("04/05/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("04/05/2023 01:13", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 05, 04);
		LocalDateTime d11 = LocalDateTime.of(2023, 05, 04, 01, 13);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}

}
