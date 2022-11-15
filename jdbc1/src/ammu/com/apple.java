package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class apple 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection w=DriverManager.getConnection("jdbc:mysql://localhost:3306/aa1","root","Mohan@123");
		Statement a=w.createStatement();
//		String t="create table aa3(id int,name varchar(50),city varchar(50))";
//		String t="insert into aa3 values(1,'ladu','mmp'),(2,'kajal','bkp'),(3,'kutti','tpt'),(4,'kukka','cgl')";
//		String t="update aa3 set name='macj'where id=4";
//		String t="delete from aa3 where id=3";
	//	a.execute(t);
//		w.close();
		String t="select * from aa3";
		ResultSet s=a.executeQuery(t);
		while(s.next())
		{
			
		System.out.println("ID :   "+s.getInt(1)+"     name: "+s.getString(2)+"city:  "+s.getString(3));
		System.out.println("done");
	}

}
}
