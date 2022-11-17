package bankDB;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
	public static Connection update() {
		try {
		Scanner sc = new Scanner(System.in);
		int cust_id=sc.nextInt();
		Connection con= jdbc.getDbConnection();

		String str="select * from account where cust_id = ?";
		PreparedStatement stmt = con.prepareStatement(str);
		stmt.setInt(1, cust_id);
		ResultSet rs=stmt.executeQuery(str);
		

		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		return con;
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		return null;
		
	}
}
