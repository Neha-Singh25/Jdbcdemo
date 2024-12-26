package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver class loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Oct2024@mysql");
//	System.out.println("success");
	PreparedStatement ps = con.prepareStatement("insert into register values('neha','neha@gmail.com','neha12','female','mzn')");
	int i = ps.executeUpdate();
	if(i > 0) {
		System.out.println("success");
	}
	else {
		System.out.println("fail");
	}
	}
}
