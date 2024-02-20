package abstractclassEmploye2;

public class Contra extends Emp{
	
	int workingHours=10;
	
	public int calculateSalary() {
		
	return getPaymentPerHour()*workingHours;	
	
	}

}
