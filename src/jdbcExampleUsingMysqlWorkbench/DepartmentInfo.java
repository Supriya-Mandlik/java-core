package jdbcExampleUsingMysqlWorkbench;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepartmentInfo {
	
	public static void main(String[] args) throws Exception{
		
		// 1] load and Register Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2] create connection
		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata?useSSL=false","root","root");

   //3] create statement

PreparedStatement ps = con.prepareStatement("select * from employeedata.department");
// employeedata is schema and department is table

  // 4] execute SQL statement and 5] process the result

ResultSet rs = ps.executeQuery();

while (rs.next()) {
	
	System.out.println("DepartmentId:"+rs.getString("DeptId")+" "+"DepartmentName:"+rs.getString("DeptName")+" "+"DepartmentZone:"+rs.getString("DeptZone"));
	
}

System.out.println("*---------------------------------------*");

PreparedStatement ps1 = con.prepareStatement("update employeedata.department set DeptName='Banking' where DeptId = 3");

int i = ps1.executeUpdate();

if (i>0) {
	System.out.println("Success");
} else {
   System.out.println("Fail");
}

ResultSet rs1 = ps1.executeQuery("select * from employeedata.department");

while(rs1.next()) {
	
	System.out.println("DepartmentId:"+rs1.getString("DeptId")+" "+"DepartmentName:"+rs1.getString("DeptName")+" "+"DepartmentZone:"+rs1.getString("DeptZone"));

}

System.out.println("*----------------------------------------*");

PreparedStatement ps2 = con.prepareStatement("delete from employeedata.department where DeptId = 2");

int j = ps2.executeUpdate();

if (j>0) {
	System.out.println("Success");
} else {
     System.out.println("Fail");
}

ResultSet rs2 = ps2.executeQuery("select * from employeedata.department");

while(rs2.next()) {
	
	System.out.println("DepartmentId:"+rs2.getString("DeptId")+" "+"DepartmentName:"+rs2.getString("DeptName")+" "+"DepartmentZone:"+rs2.getString("DeptZone"));
	
}



// 6] close Connection
 
     con.close();
		
	}

}
