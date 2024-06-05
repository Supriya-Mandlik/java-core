package MapDemo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap {
	
	public static void main(String[] args) {
		
		TestMap tm = new TestMap();
		
		LinkedHashMap<Integer, String> lhs = new LinkedHashMap<Integer, String>();
		lhs.put(1, "Supriya");
		lhs.put(2, "Saurabh");
		
		System.out.println(lhs.get(2));
		
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akole");
		al.add("Rajur");
		al.add("Kalas");
		
		hm.put("city_422601", al);
		
		tm.getData(hm);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		
		Student st1 = new Student();
		st1.setRollno(1);
		st1.setName("Rahul");
		st1.setCity("Pune");
		
		Student st2 = new Student();
		st2.setRollno(2);
		st2.setName("Rohit");
		st2.setCity("Mumbai");
		
		Student st3 = new Student();
		st3.setRollno(3);
		st3.setName("Ramesh");
		st3.setCity("Delhi");
		
		al2.add(st1);
		al2.add(st2);
		al2.add(st3);
		
		tm.printStudent(al2);
		
	LinkedHashMap<String, ArrayList<Student>> stuobj = new LinkedHashMap<String, ArrayList<Student>>();
	stuobj.put("Class_10th", al2);
	
	tm.getStudent(stuobj);
		
	}
	
	void getData(HashMap<String, ArrayList<String>> hm) {
		
		Set<String> keySet = hm.keySet();
		for (String str : keySet) {
			System.out.println(hm.get(str));
		}		
	}
	
	void printStudent(ArrayList<Student> al2) {
		for (Student student : al2) {
			//System.out.println(student.getRollno());
			//System.out.println(student.getName());
			//System.out.println(student.getCity());
			System.out.println(student);
		}
	}
	
	void getStudent(LinkedHashMap<String, ArrayList<Student>> stuobj) {
		
		Set<String> StudentkeySet = stuobj.keySet();
		
		for (String str : StudentkeySet) {
			System.out.println(stuobj.get(str));
		}
		
	}

}
