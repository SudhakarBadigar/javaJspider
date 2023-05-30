package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class fileMethods1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\java Workspace\\fileHandlingDemoFiles\\demo1.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.getParent()+"\\demo2.doc");
		System.out.println(f.getAbsolutePath());
		System.out.println(Arrays.toString(f.list()));
	    System.out.println(new Date(f.lastModified()));
	    System.out.println(f.isFile());
	    System.out.println(f.isDirectory());
	    
	} 
	
}
