package MultilevelInheritanceAssignment;

public class Grandchild extends Child {
	
	int monthlyincome;

	public int getMonthlyincome() {
		return monthlyincome;
	}

	public void setMonthlyincome(int monthlyincome) {
		this.monthlyincome = monthlyincome;
	}
	
	void Grandchild() {
		Grandchild G = new Grandchild();
			
			G.setName("Saurabh");
			G.setSurname("Mandlik");
			G.setAddress("Akole");
			G.setOccupation("job");
			G.setBloodgroup("O+ve");
			G.setAge(26);
			G.setEducation("Mcom");
			G.setMonthlyincome(30000);
		
	System.out.println("name:"+G.getName()+","+"Surname:"+G.getSurname()+","+"Address:"+G.getAddress()+","+"Occupation:"+G.getOccupation());
	System.out.println("Bloodgroup:"+G.getBloodgroup()+","+"Age:"+G.getAge()+","+"Education:"+G.getEducation()+","+"MonthlyIncome:"+G.getMonthlyincome());				
	}


}
