package exceptionHanling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFile {
	public static void main(String[] args) {
		try
		{
			FileReader r = new FileReader("C:\\Users\\DELL\\Desktop\\java backend.txt");
			try
			{
				int i;
				while(  (i=r.read()) !=  -1)
						{
					      System.out.print((char)i);
				        }
				
			}
			finally {
				r.close();
			 	
			}
		}
		catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Exception Handled");
		}
		System.out.println();
	}

}
