package jdbcdemoUsingMysqlCommandLine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//using mysql command line
// insert demo

public class insertdemo {
	
	public static void main(String[] args) throws Exception {
		
		// user values
		String name1 = "amit";     //b,c
		String email1 = "amit@gmail.com";  //b,c
		String pass1 = "amit@123";   //b,c
		String gender1 = "male";     // b,c
		String city1 = "mumbai";     // b,c
		
		// 1] load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // it throws compile time Exception
// to remove this exception we have to add jar file
// right click on project -> build path -> configure build path -> from local disk c add jar file.
// for every project we have to add jar file.
		
		//System.out.println("Driver class loaded successfully");
		
		// 2] Create Connection
		
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","root");
	// in command line 1] enter password root 2] Create database jdbc_db(database name); 3] use jdbc_db(database name);
		
		//System.out.println("Success");
 
      // 3] create statement
 
// PreparedStatement ps = con.prepareStatement("insert into Register values('"+name1+"','"+email1+"','"+pass1+"','"+gender1+"','"+city1+"')");  //b
  // PreparedStatement ps= con.prepareStatement("insert into Register values('priya','priya@gmail.com','priya123','female','chandigarh')");  // a
 PreparedStatement ps = con.prepareStatement("insert into Register values(?,?,?,?,?)"); //c
 ps.setString(1,name1);  //c
 ps.setString(2, email1); //c
 ps.setString(3, pass1); //c
 ps.setString(4, gender1); //c
 ps.setString(5, city1); //c
 
 		// ? is positional parameter
    // 1]create table in command line -> create table tablename(); 
  //eg. create table Register(Name varchar(100),EmailId varchar(100), Password varchar(100),Gender varchar(10),City varchar(50));  
 // varchar() is a datatype
    //2] desc tablename;
    
   // 4] execute SQL statement
   
   int i = ps.executeUpdate();
   
   // 5] process the result
   
   if(i>0)    // if value is inserted in database successfully it will return i>0
   {   
	  
	   System.out.println("Success");
	   
   }
   else
   {
	
	   System.out.println("Fail");
	   
   }
   
   // 6] close the connection
   
   ps.close();
    
   con.close();
    	
		
	}

}
