
/*Que 1] Why the below code is showing compile time error?
   interface X
   {
        void methodX();
   }
   class Y implements X
   {
     void methodX()
     {
       System.out.printin(""Method X");
      }
      }
 Ans- because we can not decrease accessibility of method in class.In interface methodX has public 
      access modifier.and in class the method is default.So in class we have to make method public.
       
Que 2]Is the following code Written correctly?
  public class A 
   {
	     //class A
   }
  public interface B extends A {
     // Interface B extending  class A
      }
 Ans- No.Interface Can not inherit Class.
 
Que 3] What will be the output of the following program?
    public interface P
    {
	String p = "PPPP";
	String methodP();
    }
    public interface Q extends P
    {
	String q="QQQQ";
	String methodQ();
    }
    public class R implements P,Q 
    {
	@Override
	public String methodP() {	
		return q+p;
	}
	@Override
	public String methodQ() {	
		return p+q;
	}
    }
    public class MainClass {
	public static void main(String[] args) {
		
		R r = new R();
		System.out.println(r.methodP());
		System.out.println(r.methodQ());
	}
    }
Ans- QQQQPPPP
     QQQQPPPP

Que 4] Is the below program written correctly? if yes What will be the output?
public class A implements B {
	@Override
	public int methodB(int i) {	
		return i =+ i * i;
	}
}
public interface B {	
	int methodB(int i);
}
public class MainClass {
	public static void main(String[] args) {	
		B b = new A();
		System.out.println(b.methodB(2));	
	}
}
Ans- yes.output is 4.

Que 5] What is an interface in java?
Ans- Interface in java is a blueprint of a class.The interface in java is a mechanism to achieve 
     abstraction.There can be only abstract methods in java interface,not method body.It is used to
     Achieve abstraction and multiple inheritance.We can not create object of interface.
     
Que 6] Which modifiers are allowed for methods in an interface?
Ans- Only public modifier is allowed for methods in interface.

Que 7] Suppose A is an interface.Can we create an object using new A()?
Ans- We can not create object of interface.

Que 8] Can an interface extends another interface in java?
Ans- Yes.

Que 9] Does below code compile successfully?if not,why?
 interface A {
 int i= 111;
}
 class B implements A {
void methodB() {
	 i = 222;
}
}
Ans- no.Because, The final field A,i can not be assigned.
     We can't change the value of an interface field because interface fields are final and static
     bydefault.

      */


