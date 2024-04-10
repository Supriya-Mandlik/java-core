package MavenJDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class example {
	
	public static void main(String[] args) throws Exception {
		
		String id1 = "5";
		String name1="rohit";
		String email1 = "rohit@gmail.com";
		String address1 = "akole";
		String password1="1234";
		
		// 1] load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2] create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example?useSSL=false","root","root");
		
		// 3] create statement
		//PreparedStatement ps2 = con.prepareStatement("update example.student set name ='supriya' where id = 1");
		
		//int i = ps2.executeUpdate();
		
		//PreparedStatement ps3 = con.prepareStatement("insert into example.student values('3','kiran','kiran@gmail.com','akole','456')");
		
		//int n= ps3.executeUpdate();
		
		//PreparedStatement ps4 = con.prepareStatement("insert into example.student values('4','kiran','kiran@gmail.com','akole','456')");
		
		//int j = ps4.executeUpdate();
		
		PreparedStatement ps5 = con.prepareStatement("insert into example.student values(?,?,?,?,?)");
		ps5.setString(1,id1);
		ps5.setString(2, name1);
		ps5.setString(3, email1);
		ps5.setString(4, address1);
		ps5.setString(5, password1);
		
		int k = ps5.executeUpdate();
		
		if (k>0) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
		
		PreparedStatement ps = con.prepareStatement("select * from example.student");
		
		// 4] execute sql statement and 5] process the result
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("id:"+rs.getString("id")+" "+"Name:"+rs.getString("name")+" "+"email:"+rs.getString("email")+" "+"address:"+rs.getString("address")+" "+"password:"+rs.getString("password"));
		}
		
		// 6] close connection
		
		con.close();
		
		
		
	}

}
