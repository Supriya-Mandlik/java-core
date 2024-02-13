package EncapsulationRectangleAssignment;

public class RectangleClass {

    private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public RectangleClass(int length,int breadth) {
		this.setLength(length);
		this.setBreadth(breadth);
	}
	
	
	
}
