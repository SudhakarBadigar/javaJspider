package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileList {
	public static void main(String[] args)throws IOException {
		File f = new File("D:\\java Workspace\\jspiders\\coreJava\\src");
		String[] filenames = f.list();
	System.out.println(Arrays.toString(filenames));
		
//		for(String folders:filenames) {
//			
//			System.out.println(folders);
//			}
//		
		
		
		
		
		
	}

	
}
