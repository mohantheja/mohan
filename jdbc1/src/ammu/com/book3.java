package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class book3 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection ca=DriverManager.getConnection("jdbc:mysql://localhost:/d1","root","Mohan@123");
		Statement sa=ca.createStatement();
		String s="select*from d2";
		ResultSet rs=sa.executeQuery(s);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
		}
	}

}
