package employee;

public class ConnDB {
	String connIP = "192.168.1.xx";
	String uName = "mrjava";
	String uPass = "password";

	public ConnDB() {
		try {
			Class driver = Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage();
		}
	}

}
