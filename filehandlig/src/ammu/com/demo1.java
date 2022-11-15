package ammu.com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class demo1
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream f1=new FileOutputStream("src/mohan.txt");
		ObjectOutputStream os=new ObjectOutputStream(f1);
		class1 c=new class1();
		c.ID=12;
		c.name="macj";
		c.city="bhakarapeta";
		c.pin=517194;
		os.writeObject(c);
		System.out.println("done");
		
	}
}
