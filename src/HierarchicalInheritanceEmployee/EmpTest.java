package HierarchicalInheritanceEmployee;

public class EmpTest {
	
	public static void main(String[] args) {
		
		SWDeveloper dev = new SWDeveloper();
		dev.setEmpId(10);
		dev.setMobno("1234567899");
		dev.setName("Supriya");
		dev.setSalary(10000);
		dev.setBonus(2000);
		System.out.println("SW Developer Id is:"+dev.getEmpId());
		System.out.println("SW Developer Salary is:"+dev.getSWSalary());
		System.out.println();
		
		Tester test = new Tester();
		test.setEmpId(50);
		test.setMobno("1234567899");
		test.setName("Saurabh");
		test.setSalary(10000);
		test.setShiftAllowance(5000);
		System.out.println("SW Tester Id is:"+test.getEmpId());
		System.out.println("SW Tester Salary is:"+test.getTesterSalary());
	}

}
