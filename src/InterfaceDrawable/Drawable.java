package InterfaceDrawable;

public interface Drawable {
	
	public int a = 10;
	static int b =20;
	final int c=30;
	
	
	void draw();
	
	static void display() {
		System.out.println("Static method");
	}
	
	default int get() {
		System.out.println("default method ");
		return 0;
	}
	
}
