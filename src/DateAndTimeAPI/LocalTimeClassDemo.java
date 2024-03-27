package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeClassDemo {
	
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();     // now() - present time
		System.out.println(now);
		
  LocalTime customtime = LocalTime.of(20, 30, 15); //custom time by of(hour,minute,second) method
		System.out.println(customtime);
		
		int hour = now.getHour();   // getHour()
		System.out.println(hour);
		
		String timeinstring = "15:30:45";
		LocalTime parsedtime = LocalTime.parse(timeinstring);   // parse() method 
		//LocalTime parsedtime = LocalTime.parse("15:30:45"); 
		// parse - converting string into local time
		System.out.println(parsedtime);
		
		LocalTime beforeoneHour = now.minusHours(1);      // minusHours()
		System.out.println(beforeoneHour);
		
		if (now.isAfter(beforeoneHour)) {      // isAfter() method
			System.out.println("true");
		}
		
		
		
	}

}
