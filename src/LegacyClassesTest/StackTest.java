package LegacyClassesTest;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack s = new Stack(); // only one constructor
		
		// Properties
		s.add("deepak");
		s.push("rahul");  // push() method -> it adds elements in stack
		s.push(100);
		s.push(10.25);
		
		System.out.println(s);
       System.out.println(s.pop()); // pop() method
		System.out.println(s);
	//pop() method->it removes top element from stack and returns that object/element
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek()); // peek() method
		System.out.println(s);
	// peek() method returns the top element/object but does not remove it.
		System.out.println(s.search("deepak"));  // serch() method
		System.out.println(s.empty());  // empty() method
		
	}

}
