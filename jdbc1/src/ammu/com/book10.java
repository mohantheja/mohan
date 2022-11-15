package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book10 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ammu2","root","Mohan@123");
		Statement sta=cn.createStatement();
		String sg="create table ammu4(id int,name varchar(40),city varchar(40))";
//		String sg="insert into ammu3 values(11,'mohanraja','bkp'),(23,'kajal','mmp')";
//		String sg="update ammu3 set name='theja' where id=23";
//		String sg="delete from ammu3 where id=11";
		sta.execute(sg);
		cn.close();
		System.out.println("done");
	}

}
