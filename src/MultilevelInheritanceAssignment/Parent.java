package MultilevelInheritanceAssignment;

public class Parent {
	
	String name;
	String surname;
	String Address;
	String occupation;
	String bloodgroup;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void Parent() {
		
		Parent P = new Parent();
		
		P.setName("Vitthal");
		P.setSurname("Mandlik");
		P.setAddress("Akole");
		P.setOccupation("Farmer");
		P.setBloodgroup("O+ve");
		P.setAge(80);
		
 System.out.println("name:"+P.getName()+","+"Surname:"+P.getSurname()+","+"Address:"+P.getAddress());
 System.out.println("Occupation:"+P.getOccupation()+","+"Bloodgroup:"+P.getBloodgroup()+","+"Age:"+P.getAge());
 			
	}

}
