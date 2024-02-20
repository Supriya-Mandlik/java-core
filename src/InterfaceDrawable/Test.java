package InterfaceDrawable;

public class Test {
	public static void main(String[] args) {
		
		Drawable obj = new Rectangle();
		obj.draw();     //abstract method
		System.out.println(obj.a); //public field
		System.out.println(obj.b);   //static field
		System.out.println(obj.c);    //final field
		Drawable.display();   //Static method
		obj.get();            //default method
		
		Drawable obj1 = new Circle();
		obj1.draw();
		
	}

}
