package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book5 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection aw=DriverManager.getConnection("jdbc:mysql://localhost:3306/gmr","root","Mohan@123");
		Statement aq=aw.createStatement();
		
		String sb="insert into mt values(1,'ma','mmp'),(2,'mr','bkp')";
		aq.execute(sb);
		aw.close();
		System.out.println("done");
	}

}
