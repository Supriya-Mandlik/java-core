package abstractclassShape;

public abstract class Shape {

	String color;
	
	abstract double area();
	
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape Constructor called");
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
}
