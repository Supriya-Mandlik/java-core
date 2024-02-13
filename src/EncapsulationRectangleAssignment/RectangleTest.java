package EncapsulationRectangleAssignment;

public class RectangleTest {
	
	public static void main(String[] args) {
		
		RectangleClass rt = new RectangleClass(20,30);
		int lth = rt.getLength();
		int bth = rt.getBreadth();
		int Area = lth*bth;
		System.out.println("Area:"+Area);
		rt.setLength(50);
		rt.setBreadth(60);
		int ln = rt.getLength();
		int br = rt.getBreadth();
		int newArea = ln*br;
		System.out.println("New Area:"+newArea);
	}

}
