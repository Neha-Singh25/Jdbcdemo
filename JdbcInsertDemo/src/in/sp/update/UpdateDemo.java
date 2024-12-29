package in.sp.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values:- ");
		String city1 = sc.nextLine();
		String email1 = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Oct2024@mysql");
		
		PreparedStatement ps = con.prepareStatement("update Record set city = ? where email = ?");
		ps.setString(1,city1);
		ps.setString(2,email1);
		
		int count = ps.executeUpdate();
		if(count > 0) {
			System.out.println("updated successfully");
		}
		else {
			System.out.println("updation failed");
		}
		con.close();
	}
}
