package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class prepar1 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection d=DriverManager.getConnection("jdbc:mysql://localhost:3306/as1","root","Mohan@123");
	   Statement f=d.createStatement();
	 /*  PreparedStatement g=d.prepareStatement("insert into as2 values(?,?,?)");
	   g.setInt(1,222);
	   g.setString(2,"rajamohan");
	   g.setString(3,"bkp");
//	   g.execute();*/
       /*PreparedStatement g=d.prepareStatement("update as2 set name=? where id=?");
	   g.setString(1,"ammulum");
	   g.setInt(2,111);
//	   g.execute();*/
	  PreparedStatement g=d.prepareStatement("select*from as2");
	  ResultSet r=g.executeQuery();
	  while(r.next())
	  {
		  System.out.println("id:"+r.getInt(1)+"name:"+r.getString(2)+"city:"+r.getString(3));
	  
	   System.out.println("done");
	}
	}
}
