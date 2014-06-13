package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class DBaccess {
	protected static Logger log = Logger.getLogger(Employee.class.getName());
	
	public static String viewAll()
	{ 
		String message = " ";
		try{
		Class driver = Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.164/HRdatabase", "mrjava", "password");
		System.out.println("Connection successful!");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM tbl_stdEmployee");
		while(rs.next())
		{
			message += ("Employee ID: " + rs.getInt("std_ID") + "\tFirst Name " + rs.getString("std_FNAME") + 	"\tLast Name: " + rs.getString("std_LNAME") + "\n");
		}
		return message;
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		return message;
	}
	
	public static void addRecord(String fName, String lName, int salary)
	{
		
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.164/HRdatabase", "mrjava", "password");
			System.out.println("Connection successful!");
			Statement st = c.createStatement();
			String sql = ("INSERT INTO tbl_stdEmployee(std_FNAME, std_LNAME, std_SALARY) VALUES('" + fName + "', '" + lName + "', " + salary + ")");
			System.out.println(sql);
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteRecord(int empID)
	{
		
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.164/HRdatabase", "mrjava", "password");
			System.out.println("Connection successful!");
			Statement st = c.createStatement();
			String sql = ("DELETE FROM tbl_stdEmployee WHERE std_ID = " + empID);
			System.out.println(sql);
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void modifyRecord(int empID, String fName, String lName, int salary)
	{
		
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://192.168.1.164/HRdatabase", "mrjava", "password");
			System.out.println("Connection successful!");
			Statement st = c.createStatement();
			String sql = ("UPDATE tbl_stdEmployee SET std_FNAME ='" + fName + "', std_LNAME='" + lName + "', std_SALARY='" + salary + "' WHERE std_id=" + empID);
			System.out.println(sql);
			st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
