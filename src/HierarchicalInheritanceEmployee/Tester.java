package HierarchicalInheritanceEmployee;

public class Tester extends Employee {
	
	float shiftAllowance;

	public float getShiftAllowance() {
		return shiftAllowance;
	}

	public void setShiftAllowance(float shiftAllowance) {
		this.shiftAllowance = shiftAllowance;
	}
	
	public float getTesterSalary() {
		return getSalary()+getShiftAllowance();
	}

}
