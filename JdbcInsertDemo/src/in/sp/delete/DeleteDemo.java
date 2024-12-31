package in.sp.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		String email1 = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Oct2024@mysql");
		PreparedStatement ps = con.prepareStatement("delete from Record where email = ?");
		ps.setString(1, email1);
		
		int count = ps.executeUpdate();
		if(count > 0) {
			System.out.println("deletion success");
		}
		else {
			System.out.println("deletion failed....");
		}
		
	}
}
