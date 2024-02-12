package HierarchicalInheritanceAssignment;

public class HierarchicalInheritanceEx {
	
	public static void main(String[] args) {
		
		Motorcycle M = new Motorcycle();
		M.Vehicle();
		M.showVehicle();
		
		System.out.println();
		Car C = new Car();
		C.Vehicle();
		C.showVehicle();
		
		
	}

}
