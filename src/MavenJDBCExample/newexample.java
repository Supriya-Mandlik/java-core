package MavenJDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class newexample {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newexample?useSSL=false","root","root");
		
		System.out.println("Success");
		
		PreparedStatement ps = con.prepareStatement("select * from newexample.new_table");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("rollno:"+rs.getString("rollno")+" "+"name:"+rs.getString("name")+" "+"city:"+rs.getString("city"));
		}
		
		con.close();
		
	}

}
