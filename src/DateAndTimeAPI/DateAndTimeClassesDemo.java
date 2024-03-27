package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTimeClassesDemo {
	
	public static void main(String[] args) {
		
		// 1] LocalDate class present in java.time package.
		LocalDate now = LocalDate.now();    // now() 
		System.out.println(now);    // gives present date.
		
		LocalDate customdate = LocalDate.of(1990, 2, 7);  // of(year,month,day)
		System.out.println(customdate);    // we can create custom date 
		
		int dayOfMonth = now.getDayOfMonth();  // getDayOfMonth()
		Month month = now.getMonth();          // getMonth()
		 int monthvalue = now.getMonthValue();	// getMonthValue()	
		int year = now.getYear();             // getYear()
        
		System.out.println(dayOfMonth);
		System.out.println(month);
		System.out.println(monthvalue);
		System.out.println(year);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);          // it gives todays date
		
		LocalDate yesterday = today.minusDays(1);  // minusDays() yesterday
          LocalDate yes = now.minusDays(1);	       // yesterday
          
          System.out.println(yesterday);
          System.out.println(yes);
          
         LocalDate pastDate = today.minusMonths(10);      // minusMonths() 
          System.out.println(pastDate);
          
          LocalDate pastDate2 = today.minusWeeks(2);              // minusWeeks()
		System.out.println(pastDate2);
		
		if (today.isAfter(yesterday)) {         //  isAfter() method
			System.out.println("true");
		}
		
		// many more mthods
		
	}

}
