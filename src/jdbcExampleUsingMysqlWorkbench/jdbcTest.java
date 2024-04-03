package jdbcExampleUsingMysqlWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcTest {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/hbtest?useSSL=false";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT * From hbtest.student";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1]load and register driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2] create connection
		// open a connection
		Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
		
	 // 3] create statement
		
		Statement stmt = con.createStatement();
		
		// 4] Execute SQL statement and 5] prepare the result
		
		/*ResultSet rs = stmt.executeQuery(QUERY);
		// extract data from ResultSet
		while(rs.next()) {
			// retrive by column name
			System.out.println("id:"+rs.getString("id"));
			System.out.println("Name:"+rs.getString("name"));
			System.out.println("School:"+rs.getString("school"));
			System.out.println("Course:"+rs.getString("cource"));
			System.out.println("Address:"+rs.getString("city"));
			System.out.println("*----------------------------*");
			
		}*/
		
		System.out.println("After Update Statement");
		stmt.executeUpdate("update hbtest.student set school = 'VVPS' where id = 1 ");
		stmt.executeUpdate("delete from hbtest.student where id = 5 "); 
		 ResultSet rs1 = stmt.executeQuery(QUERY);
		 // Extract data from resultSet
		 while(rs1.next()){
		 // retrive by column name
		    System.out.println("id:"+rs1.getString("id"));
			System.out.println("Name:"+rs1.getString("name"));
			System.out.println("School:"+rs1.getString("school"));
			System.out.println("Course:"+rs1.getString("cource"));
			System.out.println("Address:"+rs1.getString("city"));
			System.out.println("*----------------------------*");

			
		  }
		  
		
		// 6] close connection
		
		con.close();
		
		
		
	}

}
