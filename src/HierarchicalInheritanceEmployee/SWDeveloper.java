package HierarchicalInheritanceEmployee;

public class SWDeveloper extends Employee {
	
	private float bonus;
	
	public float getBonus() {
		return bonus;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float getSWSalary() {
		return getSalary()+getBonus();
	}

}
