//Create Write Test class:-
package ammu.com;

import java.io.FileWriter;

public class ammuwrite 
{
	public static void main(String args[])throws Exception
	{
		FileWriter fw=new FileWriter("src/macj.txt");
		String msg="This is a mla mean is mohan love ammulu";
		fw.write(msg);
		fw.flush();
		System.out.println("done");
	}

}
