
/*question 1] How many types of access modifiers are available in java?
Answer- There are 4 types of access modifiers are available in java. 1>public 2>default 3>private 4>protected

Question 2] What happens if you don't specify access modifier?
Ans.-If you dont specify any access modifier then it will be considered as default access modifier.

Question 3] Can we make a class private in java?
Ans.-We can not make class private in java. If we make class private in java then we can not use that class anywhere in that project,so 
     there is no use of making class that is why class can not be private.

Que. 4] Can we declare a class as protected?
Ans.-Yes we can declare a class as protected.A protected class is only accessible to its subclasses and classes in the same package.

Que.5]Why you should make your field private in java?
Ans.-When a field is private,the caller cannot usually get inappropriate direct access to the field.

Que. 6] Why getter method is better than public variables in java?
Ans.-The getter and setter method gives you centralized control of how a certain field is initialized and provided to the client,which 
     makes it much easier to verify and debug.By using getter and setter method to access variables we can apply conditions to variable.
	 but while accessing variable ditectly by making it public variables we can not apply conditions to it.

Que. 7]What is difference between public and protected modifier in java?
Ans.-public can be accessed anywhere in the project.protected can be accessed within the package only if we want to access 
     protected in any other class of any other package then we have to create parent child relationship between these two classes.

Que.8] Can we have a private constructor in java? What is the role of private constructure in java?
Ans.-Yes we can declare a constructure private in java.If a constructor is private then we are not able to create an object of the class.
     A private constructure in java is used in restricting object creation.if a constructure is declared as private,then its objects are only 
	 accessible from within the declared class.

Que.9] Can we declare a top level class as protected?
Ans.-No we can not declare a top-level class as private or protected.It can be either public or default.

Que.10] Why are Access modifiers used?
Ans.-Java provides access modifiers to set access levels for classes,variables,methods and constructors.To control the visibility of classes,
     variables,methods,constructors.*/
