package HierarchicalInheritanceAssignment;

public class Motorcycle extends Vehicle {
	
	void showVehicle() {
		
		Motorcycle M = new Motorcycle();
		
		M.setModelname("Shine");
		M.setColor("Black");
		M.setNumwheels(2);
		M.setNumseats(2);
		M.setFualtype("Petrol");
		M.setTopspeed("93kmph");
		
		
		System.out.println("Model Name-"+M.getModelname());
		System.out.println("color-"+M.getColor());
		System.out.println("Number of Wheels-"+M.getNumwheels());
		System.out.println("Number of Seats-"+M.getNumseats());
		System.out.println("Type of Fual-"+M.getFualtype());
		System.out.println("Top Speed-"+M.getTopspeed());
		
	}

}
