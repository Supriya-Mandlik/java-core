package jdbcdemoUsingMysqlCommandLine;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// using mysql command line
// select demo to retrive values or to get values from database

public class SelectDemo {
	
	public static void main(String[] args) throws Exception {
		
		// 1] load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2] Create Connection

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","root");
		// jdbc_db is created database name

       // 3] Create Statement

 PreparedStatement ps = con.prepareStatement("select * from Register");
 
   // 4] Execute SQL Statement  and 5] process the result
 
    ResultSet rs = ps.executeQuery();
    
    while(rs.next()) {
    	
    	String name1 = rs.getString("Name");
    	System.out.println(name1);
    	String email1 = rs.getString("EmailId");
    	System.out.println(email1);
    	String pass1 = rs.getString("Password");
    	System.out.println(pass1);
    	String gender1 = rs.getString("Gender");
    	System.out.println(gender1);
    	String city1 = rs.getString("City");
    	System.out.println(city1);
    	System.out.println("*----------------------*");
    	
    }
 
   // 6] close Connection
    
    con.close();

	}

}
