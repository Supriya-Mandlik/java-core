package MultilevelInheritanceAssignment;

public class Child extends Parent {
	
	String Education;

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}
	
	void Child() {
		
        Child C = new Child();
		
		C.setName("Sanjay");
		C.setSurname("Mandlik");
		C.setAddress("Akole");
		C.setOccupation("Farmer");
		C.setBloodgroup("O+ve");
		C.setAge(50);
		
	System.out.println("name:"+C.getName()+","+"Surname:"+C.getSurname()+","+"Address:"+C.getAddress());
	System.out.println("Occupation:"+C.getOccupation()+","+"Bloodgroup:"+C.getBloodgroup()+","+"Age:"+C.getAge());	
	}


}
