package OptionalClassDemo;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClassTest {
	
	public static void main(String[] args) {
	
		Optional<String> name = getName(2);
		if (name.isPresent()) {                     // isPresent - returns boolean
			System.out.println(name.get());
		}
		
		name.ifPresent(x -> System.out.println(x)); // ifPresent(Consumer)
		//name.ifPresent(System.out::println);
		
		Optional<String> name2 = getName2(3);
		//String nametobeused = name.isPresent()?name.get(): "NA" ;
		String nametobeused = name.orElse("NA");    // orElse()
	   //String nametobeused = name.orElseGet( () -> "NA");   // orElseGet(supplier)
		//String nametobeused = name.orElseThrow( () -> new NoSuchElementException() );
		//String nametobeused = name.orElseThrow( NoSuchElementException::new );
		 // orElseThrow(supplier) = used to throw exception
		System.out.println(nametobeused);
		
		Optional<String> optional = getName3(5);
		Optional<String> optional2 = optional.map( x -> x.toUpperCase()); // map(Funtion)
		optional2.ifPresent(System.out::println);
		
	}
	
	private static Optional<String> getName(int id){
		//String name = "Advik";
         String name = null;
         // returns Optional.of(name);       // Optional.of() - it gives exception for null 
		return Optional.ofNullable(name);   // Optional.ofNullable()
		
	}
	
	private static Optional<String> getName2(int id){
		
		return Optional.empty();     // Optional.empty()
		
	}
	
   private static Optional<String> getName3(int id){
		
		return Optional.of("Advik");     // Optional.empty()
		
	}
	
	

}
