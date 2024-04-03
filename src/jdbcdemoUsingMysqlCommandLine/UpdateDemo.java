// using mysql command line
// Update Demo
package jdbcdemoUsingMysqlCommandLine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	
	public static void main(String[] args) throws Exception {
		
		String city1 = "pune";
		String email1 = "kamal@gmail.com";
	
		// 1] load and register driver
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// 2] create connection
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","root");
		
// in command line - 1] enter password 2] use databasename; 3]show tables; 4] select * from register;
	
	// 3] create statement
	
	PreparedStatement ps = con.prepareStatement("update register set city=? where emailid = ?");
	ps.setString(1, city1);
	ps.setString(2, email1);
	
	// 4] execute SQL statement  5] process the result
	
	int count = ps.executeUpdate();
	
	if (count>0) {
		System.out.println("Updated successfully");
	} else {
        System.out.println("Updation Failed");
	}
	
	// 6] close the connection
	
	con.close();
	
	}

}
