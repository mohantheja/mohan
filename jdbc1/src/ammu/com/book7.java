package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class book7 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection az=DriverManager.getConnection("jdbc:mysql://localhost:3306/gcm","root","Mohan@123");
		Statement ax=az.createStatement();
		//String s1="create table gji(id int,name varchar(50),city varchar(50)";
		String s1="insert into gji values(1,'gsr','cgl'),(2,'gsk','tpt')";
		ax.execute(s1);
		az.close();
		//
		ResultSet rs=ax.executeQuery(s1);
		System.out.println("done");
	}

}
