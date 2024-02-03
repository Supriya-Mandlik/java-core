

public class Employee {
	
	String name;
	int age;
	int expyear;
	int mobno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>0) {
			this.age=age;
		} else {
          System.out.println("Entered value is incorrect");
          this.age=0;
		}
		
	}
	public int getExpyear() {
		return expyear;
	}
	public void setExpyear(int expyear) {
		if (expyear>0) {
			this.expyear=expyear;
		} else {
          System.out.println("Entered value is incorrect");
          this.expyear=0;
		}
		
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", expyear=" + expyear + ", mobno=" + mobno + "]";
	}
	
	//void toString1() {
		//System.out.println("Employee name:"+name);
		//System.out.println("Employee Age:"+age);
		//System.out.println("Employee Experience Year:"+expyear);
		//System.out.println("Employee Mobile number:"+mobno);
	//}
	
	

}
