package HierarchicalInheritanceAssignment;

public class Vehicle {
	
	
	String modelname;
	String color;
	int numwheels;
	int numseats;
	String fualtype;
	String topspeed;

	public String getModelname() {
		return modelname;
	}


	public void setModelname(String modelname) {
		this.modelname = modelname;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumwheels() {
		return numwheels;
	}


	public void setNumwheels(int numwheels) {
		this.numwheels = numwheels;
	}


	public int getNumseats() {
		return numseats;
	}


	public void setNumseats(int numseats) {
		this.numseats = numseats;
	}


	public String getFualtype() {
		return fualtype;
	}


	public void setFualtype(String fualtype) {
		this.fualtype = fualtype;
	}


	public String getTopspeed() {
		return topspeed;
	}


	public void setTopspeed(String topspeed) {
		this.topspeed = topspeed;
	}
	
	void Vehicle() {
		System.out.println("Vehicle");
	}
	


}
