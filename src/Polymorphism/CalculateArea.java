package Polymorphism;

public class CalculateArea {
	
	public static void main(String[] args) {
		
		CalculateArea obj = new CalculateArea();
		obj.Area(5.5f);
		obj.Area(6.6f,5.5f);
		obj.Area(10);
		obj.Area(20,10);
		
	}
	
	void Area(float r) {
		double area = 3.14*r*r; 
		System.out.println("Area of Circle is:"+area);
	}
	
	void Area(float b,float h) {
		double area = 0.5*b*h;
		System.out.println("Area of Triangle is:"+area);
	}
	
	void Area(int a){
		int area = a*a;
		System.out.println("Area of Square is:"+area);
	}
	
	void Area(int L,int W) {
		int area = L*W;
		System.out.println("Area of Rectangle is:"+area);
	}

}
