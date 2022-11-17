package bankDB;
import java.util.Scanner;
import java.sql.*;

import bankDB.jdbc;

public class Deposit {

	public static Connection Deposit() {
		// TODO Auto-generated method stub
		try
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter cust_id and amount to be deposit");
			int cust_id=sc.nextInt();

			int bal=sc.nextInt();
			Connection con= jdbc.getDbConnection();
			
			String str = "update account set acc_amount=acc_amount+ ? where cust_id= ?";
			String st3 = "select c.cust_id,c.cust_name,a.acc_amount from customer c inner join account a on c.cust_id=a.cust_id where c.cust_id=?";

			PreparedStatement stmt = con.prepareStatement(str);
			PreparedStatement stmt3 = con.prepareStatement(st3);

			stmt.setInt(1,bal);
			stmt.setInt(2,cust_id);
			stmt3.setInt(1,cust_id);			

			
			int rs=stmt.executeUpdate();
			System.out.println(rs+" Row Updated");
			
			ResultSet rs3=stmt3.executeQuery();
			System.out.println();
			while(rs3.next()) {
				System.out.println("Customer updated details :"+"\nCust_id: "+rs3.getString(1)+"\n"+"Cust_name: "+rs3.getString(2)+"\n"+"Acc_Bal: "+rs3.getFloat(3));
			}
//			while(rs.next())
//				System.out.println(rs.getInt(1)+" "+rs.getString(2));
     	}
		catch(Exception e) {
		System.out.println(e);
	}
		return null;

}}
