package bankDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDetail {
	public static Connection getDetails() throws ClassNotFoundException, SQLException {
		Connection con= jdbc.getDbConnection();

		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select c.cust_id,c.cust_name,a.acc_amount from customer c,account a where c.cust_id=a.cust_id");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		return con;
	}
}
