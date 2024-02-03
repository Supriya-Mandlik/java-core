

public class WorkerArray {
	
	public static void main(String[] args) {
		
	WorkerArray obj = new WorkerArray();
Worker[] arr = obj.addworkerInArray();
	obj.printArray(arr);
		
		WorkerAnother object = new WorkerAnother();
		object.printArray(arr);
	}

Worker[] addworkerInArray() {
	
	Worker obj1 = new Worker();
	obj1.setName("Santosh");
	obj1.setAge(30);
	obj1.setExpyear(10);
	
	Worker obj2 = new Worker();
	obj2.setName("Prashant");
	obj2.setAge(35);
	obj2.setExpyear(15);
	
	Worker obj3 = new Worker();
	obj3.setName("Kiran");
	obj3.setAge(33);
	obj3.setExpyear(13);
	
	Worker[] arr = new Worker[3];
	arr[0] = obj1;
	arr[1] = obj2;
	arr[2] = obj3;
	
	return arr;
	
}

void printArray(Worker[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		Worker val = arr[i];
		System.out.println(val);
	}
}
}