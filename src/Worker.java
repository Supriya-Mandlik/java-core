

public class Worker {
	
	String name;
	int age;
	int expyear;
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
		this.age = age;
	}
	public int getExpyear() {
		return expyear;
	}
	public void setExpyear(int expyear) {
		this.expyear = expyear;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", expyear=" + expyear + "]";
	}
	
	

}
