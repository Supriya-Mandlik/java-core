package MavenJDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcexample {
	
	public static void main(String[] args) throws Exception {
		
		// 1] load and register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2] create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simo?useSSL=false","root","root");
		
		// 3] create statement
		PreparedStatement ps = con.prepareStatement("select * from simo.user");
		
		// 4] execute sql statement and 5] process the result
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println("id:"+rs.getString("id"));
			System.out.println("name:"+rs.getString("name"));
			System.out.println("email:"+rs.getString("email"));
			System.out.println("password:"+rs.getString("password"));
		}
		
		con.close();
		
	}

}
