//create FileWriteclass
package ammu.com;

import java.io.File;
import java.io.FileOutputStream;

public class fileWrite 
{
	public static void main (String args[])throws Exception
	{
		File f=new File("src/ammu.txt");
		FileOutputStream a=new FileOutputStream(f);
		String msg="Hi this write by macj";
		a.write(msg.getBytes());
		System.out.println("done");
		
	}

}
