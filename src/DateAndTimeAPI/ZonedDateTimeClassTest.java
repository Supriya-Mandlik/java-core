package DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeClassTest {
	
	public static void main(String[] args) {
		
		/* ZonedDateTime - it gives date and time with zone.*/
		
		ZonedDateTime now = ZonedDateTime.now();   // now()
	// it gives date and time with zone . our zone is [Asia/Kolkata] and we are 5:30 above UTC time
		System.out.println(now);
		
		// all zones
		//Set<String> availablezoneIds = ZoneId.getAvailableZoneIds();
	     //System.out.println(availablezoneIds.size());   
		//availablezoneIds.forEach(System.out::println);
		
		// custom zoned date and time
	ZonedDateTime custom = ZonedDateTime.of(2000, 12, 1, 14, 30, 30,30,ZoneId.of("America/New_York"));
	System.out.println(custom);
	
	  ZonedDateTime indianow = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // ZonedId.of(zone name);
	  System.out.println("Current Time in India-"+indianow);
	  
	  ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
	  System.out.println("Current Time in NewYork-"+newYorkTime);
	  
	  ZoneId zoneid = now.getZone();  // getZone()
	  System.out.println(zoneid);
	  
	  ZonedDateTime parse = ZonedDateTime.parse("2024-03-23T13:35:10.107004300+05:30[Asia/Calcutta]");
	  System.out.println(parse);
	  
		
	}

}
