package bankDB;

import java.sql.*;
public class jdbc 
	{

	public static Connection getDbConnection() throws ClassNotFoundException,SQLException{
		// Step 1: make connection To db
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		System.out.println("---driver get loaded---");
		
		// load OracleDriver

		Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1522:xe","shubham","shub123");
//		System.out.println("----Connection done----");
		return con;
			
	}

	
}
	

