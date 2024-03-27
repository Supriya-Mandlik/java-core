package DateAndTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class InstantClassTest {
	
	public static void main(String[] args) {
		
		Long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		// currentTimeMillis() - it gives milliseconds from 1 january 1970 UTC
		
		// Instant class
		
		Instant now = Instant.now();
		System.out.println(now);
		// Instant -  it gives nanoseconds from 1 january 1970 UTC
		
		// Duration Class
		
		Instant end = Instant.now();
		Duration d1 = Duration.between(now, end);   // between() 
		System.out.println(d1);
		
		LocalDateTime a= LocalDateTime.now();
		LocalDateTime b= LocalDateTime.now();
		Duration d2 = Duration.between(a, b);
		System.out.println(d2);
		
		// Period
		
		LocalDate now2 = LocalDate.now();
		LocalDate then = LocalDate.of(1999, 3, 31);
		Period period = Period.between(now2, then);
		System.out.println(period);
		
		// DateTimeFormatter
		
		LocalDate now3 = LocalDate.now();
		System.out.println(now3);
		
		LocalDate parse = now3.parse("2024-03-23");   // original format
		System.out.println(parse);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // change format
		String changeFormat = now3.format(myFormat);
		System.out.println(changeFormat);
		
		String date = "25/04/1998";
		DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parse2 = LocalDate.parse(date,datetimeformatter);
		System.out.println(parse2); 
		// converting String into Local Date Format
		
		String datetimestring = "2024-03-23T14:26:43.677436+05:30[Asia/Calcutta]";
		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ssXXX");
		ZonedDateTime zoneddatetime = ZonedDateTime.parse(datetimestring);
		System.out.println(zoneddatetime);
		
	}

}
