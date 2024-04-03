// using mysql command line
// Delete Demo
package jdbcdemoUsingMysqlCommandLine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	
	public static void main(String[] args) throws Exception {
		
		String email1 = "priya@gmail.com";
		
		// 1] load and Register Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2] create connection
		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSl=false","root","root");
		
       // 3] Create Statement

      PreparedStatement ps = con.prepareStatement("delete from Register where emailId=?");
      
      ps.setString(1, email1);
      
     // 4] Execute SQL statement and 5] process the result
      
    int count =  ps.executeUpdate();
    
   // System.out.println(count);
    
    if (count>0) {
		System.out.println("Deletion Successful");
	} else {
        System.out.println("Deletion Failed");
	}
    
    // 6] close connection
    
    con.close();


	}

}
