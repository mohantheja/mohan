package ammu.com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class democlass 
{
	public static void main(String args[])throws Exception
	{
		FileInputStream f2=new FileInputStream("src/mohan.txt");
		ObjectInputStream o=new ObjectInputStream(f2);
		class1 m=(class1)o.readObject();
		System.out.println(m.ID+"  "+m.name+"  "+m.city+"  "+m.pin);
	}

}
