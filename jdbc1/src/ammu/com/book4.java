package ammu.com;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

public class book4 
{
	public static void main(String args[])throws Exception
	{

  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection cv= DriverManager.getConnection("jdbc:mysql://localhost:/m1","root","Mohan@123");
  Statement sv=cv.createStatement();
  
 String s2="drop table m2";
  sv.execute(s2);
  cv.close();
  System.out.println("done");
	}
}
