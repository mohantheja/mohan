package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class book1 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/z1","root","Mohan@123");
		Statement st=con.createStatement();
		//String sql="create table z2(id int,name varchar(50),city varchar(50)";
		//	String sql="insert into z2 values(11,'nani','kkp'),(12,'ammulu','mmp'),(13,'yogi','bkp')";
	    //String sql="update z2 set name="moha"where id=11";
		String sql="delet from z2 where id=113";
        st.execute(sql);
        con.close();
        System.out.println("done");
	}
}
