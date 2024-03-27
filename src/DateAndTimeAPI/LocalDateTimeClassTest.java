package DateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeClassTest {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();   // now() - present date and time
		System.out.println(now);
		
		LocalDateTime custom = LocalDateTime.of(1999, 3, 31, 9, 13, 12);
		// custom date time - of(year,month,day,hour,minute,seconds)
		System.out.println(custom);
		
		// parse - converting string into local date and time
	LocalDateTime parse = LocalDateTime.parse("2024-03-23T12:58");   // parse() and T is separator
	System.out.println(parse);
	
	
		
	}

}
