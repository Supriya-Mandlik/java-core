package abstractclassEmploye2;

public class Main {
	public static void main(String[] args) {
		
		Emp obj = new Contra();
		obj.setPaymentPerHour(10);		
		System.out.println(obj.calculateSalary());

		Emp obj1 = new FullTime();
		obj1.setPaymentPerHour(10);		
		System.out.println(obj1.calculateSalary());

		
	}
	
}
