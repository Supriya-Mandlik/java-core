package OverrideTestEmployee2;

public class Employee {
	
	int empId;
	String name;
	int base = 10000;
	int expyear;
	
	 int IncrementSalary(){
		 
		 return base;
		
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExpyear() {
		return expyear;
	}

	public void setExpyear(int expyear) {
		this.expyear = expyear;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
