package bankDB;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

public class Testbank {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		String a, b;

		System.out.println("Enter username ");
		a = sc.next();
		System.out.println("Enter Password ");
		b = sc.next();

		Password p=new Password();
		
		if (a.equals(p.getUsername()) && b.equals(p.getPassword())) 
		{
			jdbc m1 = new jdbc();
			Connection con = jdbc.getDbConnection();


			boolean d = true;
			while (d == true) {
				System.out.println(
						"\nEnter \n1.Add Customer \n2.Customer Details \n3.Deposit Amnt \n4.Withdraw amnt \n5.Transfer Amnt \n6.Exit");
				
				int m = sc.nextInt();
				switch (m) {

				case 1:
					Add_Cust m6 = new Add_Cust();
					m6.Add();
					break;
				
				
				case 2:
					GetDetail m2 = new GetDetail();
					m2.getDetails();
					break;

				case 3:
					Deposit m3 = new Deposit();
					Connection con2 = Deposit.Deposit();
					break;

				case 4:
					Withdraw m4 = new Withdraw();
					Connection con3 = Withdraw.Withdraw();
					break;

				case 5:
					Transfer m5 = new Transfer();
					Connection con4 = Transfer.Transfer();
					break;

				case 6:
					System.out.println("Thank You visit Again....");
					d = false;
					break;

				default:
					System.out.println("Wrong input try again..");
				}
			}
		} else
			System.out.println("Invalid username and password");

	}
}
