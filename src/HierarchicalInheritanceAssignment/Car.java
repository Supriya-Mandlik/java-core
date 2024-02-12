package HierarchicalInheritanceAssignment;

public class Car extends Vehicle {

	void showVehicle() {
		
		Car C = new Car();
		
		C.setModelname("Swift");
		C.setColor("Red");
		C.setNumwheels(4);
		C.setNumseats(5);
		C.setFualtype("Diesel");
		C.setTopspeed("165kmph");
		
		
		System.out.println("Model Name-"+C.getModelname());
		System.out.println("color-"+C.getColor());
		System.out.println("Number of Wheels-"+C.getNumwheels());
		System.out.println("Number of Seats-"+C.getNumseats());
		System.out.println("Type of Fual-"+C.getFualtype());
		System.out.println("Top Speed-"+C.getTopspeed());
	}
	
}
