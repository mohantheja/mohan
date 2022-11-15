package ammu.com;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class readfile 
{
	public static void main(String args[])throws Exception
	{
		FileInputStream s=new FileInputStream("src/ammu.txt");
		BufferedInputStream b=new BufferedInputStream(s);
		byte [] v=new byte[1024];
		int x=0;
		while ((x=b.read(v))!=-1)
		{
			System.out.println(new String (v,0,x));
		}
		
	}

}
