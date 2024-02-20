package interfaceExample2;
 
public class R implements P,Q {
	
	@Override
	public String methodP() {
		
		return q+p;
	}


	@Override
	public String methodQ() {
		
		return p+q;
	}

	
}
