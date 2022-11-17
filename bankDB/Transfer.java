package bankDB;
import java.util.Scanner;
import java.sql.*;

import bankDB.jdbc;

public class Transfer {

	public static Connection Transfer() {
		// TODO Auto-generated method stub
		try
		{	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter cust_id of sender : ");
			int sender=sc.nextInt();
			System.out.println();
			
			System.out.print("Enter cust_id of Reciever: ");
			int receiver=sc.nextInt();
			System.out.println();
			
			System.out.print("Enter Amount to be transferred: ");
			int bal=sc.nextInt();
			
			Connection con= jdbc.getDbConnection();
			
			String str = "update account set acc_amount=acc_amount - ? where cust_id= ?";
			String st1 = "update account set acc_amount=acc_amount + ? where cust_id= ?";
			String st3 = "select c.cust_id,c.cust_name,a.acc_amount from customer c inner join account a on c.cust_id=a.cust_id where c.cust_id=?";
			String st4 = "select c.cust_id,c.cust_name,a.acc_amount from customer c inner join account a on c.cust_id=a.cust_id where c.cust_id=?";
			PreparedStatement stmt = con.prepareStatement(str);
			PreparedStatement stmt1 = con.prepareStatement(st1);
			PreparedStatement stmt3 = con.prepareStatement(st3);
			PreparedStatement stmt4 = con.prepareStatement(st4);

			stmt.setInt(1,bal);
			stmt.setInt(2,sender);
			stmt1.setInt(1,bal);
			stmt1.setInt(2,receiver);
			stmt3.setInt(1,sender);			
			stmt4.setInt(1,receiver);			

			
			int rs=stmt.executeUpdate();
			int rs1=stmt1.executeUpdate();
			System.out.println(" Amount Debited from: "+sender);
			System.out.println(" Amount received to: "+receiver);

			ResultSet rs3=stmt3.executeQuery();
			System.out.println();
			while(rs3.next()) {
				System.out.println("Senders updated details :"+"\nCust_id: "+rs3.getString(1)+"\n"+"Cust_name: "+rs3.getString(2)+"\n"+"Acc_Bal: "+rs3.getFloat(3));
			}
			ResultSet rs4=stmt4.executeQuery();
			
			System.out.println();
			while(rs4.next()) {
				System.out.println("Receivers updated details :"+"\nCust_id: "+rs4.getString(1)+"\n"+"Cust_name: "+rs4.getString(2)+"\n"+"Acc_Bal: "+rs4.getFloat(3));
			}
			return con;
     	}
		catch(Exception e) {
		System.out.println(e);
	}
		return null;

}}
