package in.sp.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		
		//-----USER VALUES---
	/*	String name1 = "amit";
		String email1 = "amit@gmail.com";
		String pass1 = "amit123";
		String gender1 = "male";
		String city1 = "banglore";
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:-");
		
		String name1 = sc.nextLine();
		String email1 = sc.nextLine();
		String pass1 = sc.nextLine();
		String gender1 = sc.nextLine();
		String city1 = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver class loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Oct2024@mysql");
//	System.out.println("success");
	
	//PreparedStatement ps = con.prepareStatement("insert into register values('neha','neha@gmail.com','neha12','female','mzn')");
	
	PreparedStatement ps = con.prepareStatement("insert into Record values (?,?,?,?,?)");
	ps.setString(1, name1);
	ps.setString(2, email1);
	ps.setString(3, pass1);
	ps.setString(4, gender1);
	ps.setString(5, city1);
	
	int i = ps.executeUpdate();
	if(i > 0) {
		System.out.println("success");
	}
	else {
		System.out.println("fail");
	}
	}
}
