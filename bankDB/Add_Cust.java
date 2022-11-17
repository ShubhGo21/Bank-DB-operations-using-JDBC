package bankDB;
import java.util.Scanner;
import java.sql.*;

import bankDB.jdbc;

public class Add_Cust {

	public static Connection Add() {
		// TODO Auto-generated method stub
		try
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("To Create Account :\nEnter Acc_ID,cust_id,Acc_type,Cust_name,Cust_city,Cust_Email,Acc_Amount");
			int acc_id=sc.nextInt();
			int cust_id=sc.nextInt();

			String acc_type=sc.next();
			String Cust_name=sc.next();
			String Cust_city=sc.next();
			String Cust_Email=sc.next();
			int Acc_Amount=sc.nextInt();

			Connection con= jdbc.getDbConnection();
			
			String str = "insert into account values (?,?,?,?)";
			String st3 = "insert into customer values (?,?,?,?)";
			String st4 = "select c.cust_id,c.cust_name,a.acc_amount from customer c inner join account a on c.cust_id=a.cust_id where c.cust_id=?";

			
			PreparedStatement stmt = con.prepareStatement(str);
			PreparedStatement stmt3 = con.prepareStatement(st3);
			PreparedStatement stmt4 = con.prepareStatement(st4);


			stmt.setInt(1, acc_id);			
			stmt.setInt(2,cust_id);
			stmt.setString(3, acc_type);
			stmt.setInt(4,Acc_Amount);

			stmt3.setInt(1,cust_id);
			stmt3.setString(2,Cust_name);	
			stmt3.setString(3,Cust_city);	
			stmt3.setString(4,Cust_Email);	
			
			stmt4.setInt(1,cust_id);


			
			int rs=stmt.executeUpdate();
			System.out.println(rs+" Row Updated");
			
			ResultSet rs3=stmt3.executeQuery();
			ResultSet rs4=stmt4.executeQuery();

			System.out.println();
			
			while(rs4.next()) {
				System.out.println("New Customer Details updated :\n"+"\nCust_id: "+rs4.getString(1)+"\n"+"Cust_name: "+rs4.getString(2)+"\n"+"Acc_Bal: "+rs4.getFloat(3));
			}
//			while(rs.next())
//				System.out.println(rs.getInt(1)+" "+rs.getString(2));
     	}
		catch(Exception e) {
		System.out.println(e);
	}
		return null;

}}
