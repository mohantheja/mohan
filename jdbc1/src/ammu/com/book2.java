package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book2 
{
public static void main(String args[])throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/e1","root","Mohan@123");
	Statement st=co.createStatement();
	String sql1="insert into q2 values(22,'sree','bkp'),(23,'teja','mmp')";
	st.execute(sql1);
	co.close();
	System.out.println("done");
}
}
