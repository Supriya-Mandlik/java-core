package OverrideTestEmployee;

public class SWDeveloper extends Employee {
	
	String adharNo;
	
	//Access modifiers-public>protected>default>private
	/*Access modifier of child class method should be same as parent class method
	   or more accessible than that*/
	
	public SWDeveloper saveEmployee() {
		System.out.println("Save Employee Details with Adhar Number:");
		return new SWDeveloper(); //return the object
		//return type should be same for primitive data type.
		/* if return type of parent class method is a non primitive type then a
		 covariant return type can also be used.*/
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	

}
