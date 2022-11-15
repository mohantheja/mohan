//Create Read Test class:-
package ammu.com;

import java.io.BufferedReader;
import java.io.FileReader;

public class ammuread 
{
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader("src/macj.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine()+" ");
	}

}
