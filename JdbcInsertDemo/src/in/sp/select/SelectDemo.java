package in.sp.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Oct2024@mysql");
		PreparedStatement ps = con.prepareStatement("select * from Record");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
//			String name1 = rs.getString("name");
//			System.out.println(name1);
			
			System.out.println(rs.getString("name")+"--"+rs.getString("email")+"--"+rs.getString("password")+"--"+rs.getString("gender")+"--"+rs.getString("city"));
			System.out.println("-----------------------------------------------------------------------------");
		}
		con.close();
	}
}
