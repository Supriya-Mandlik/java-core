package interfaceExample1;

public class A implements B {

	@Override
	public int methodB(int i) {
		
		return i =+ i * i;
	}

}
