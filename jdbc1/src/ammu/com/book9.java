package ammu.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class book9 
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection ga=DriverManager.getConnection("jdbc:mysql://localhost/nani1","root","Mohan@123");
		Statement gs=ga.createStatement();
		PreparedStatement st=ga.prepareStatement("insert into nani2 values(?,?,?)");
		st.setInt(1,213 );
		st.setString(2,"ball");
		st.setString(3,"car");
		st.execute();
		/*PreparedStatement st=ga.prepareStatement("update nani2 set name=? where id=?");
		st.setString(1,"dog");
		st.setInt(1,214);
		st.execute();*/
	/*	PreparedStatement st=ga.prepareStatement("select * from nani2");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println("ID: "+rs.getInt(1)+"NAME: "+rs.getString(2)+"city: "+rs.getString(3));
		}*/
		System.out.println("done");
		}
		
	}

