package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBaccess {
	
	public static void viewAll()
	{ 
		try{
		Class driver = Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.141/HRdatabase", "mrjava", "password");
		System.out.println("Connection successful!");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM tbl_stdEmployee");
		while(rs.next())
		{
			System.out.println("yeoo");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
