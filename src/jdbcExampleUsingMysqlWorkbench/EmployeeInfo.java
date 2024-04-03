package jdbcExampleUsingMysqlWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeInfo {
	
	public static void main(String[] args) throws Exception {
		
		// 1] load and register Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2] Create Connection
		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata?useSSL=false","root","root");
// employeedata is schema name
 
     //3] create Statement

  PreparedStatement ps = con.prepareStatement("select * from employeedata.employee");
 // employeedata is schema and employee is table
  
  // 4] Execute SQL statement and 5] process the result
  
   ResultSet rs=ps.executeQuery();
   
   while(rs.next())
   {
	 System.out.println("EmpId:"+rs.getString("empId")+" "+"EmpName:"+rs.getString("EmpName")+" "+"EmpAge:"+rs.getString("EmpAge")+" "+"EmpDept:"+rs.getString("EmpDept"));
	  // getString("column name"); method 
   }
   
   // 6] close connection
   
   con.close();

	}

}
