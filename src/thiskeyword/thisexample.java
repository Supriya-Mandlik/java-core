package thiskeyword;

public class thisexample {
	
	int rollno;
	String name,course;
	float fee;
	
	 thisexample(int rollno,String name,String course) {
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}

	 thisexample(int rollno,String name,String course,float fee){
		 this(rollno,name,course);
		 this.fee=fee;
	 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+course+" "+fee);
	 }
}
