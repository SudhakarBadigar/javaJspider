package exceptionHanling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException.*;

public class ReadingAFile {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:\\java Workspace\\jspiders\\coreJava\\src\\exceptionHanling\\Learning.txt");
	     int i;
	     
	     while ( (i=file.read() ) != -1) {
	    	 System.out.println((char)i);
	     }
	}

}
