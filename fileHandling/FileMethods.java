package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
	public static void main(String[] args) throws IOException {
		File f1 = new File("./src/fileHandling/demotxt2.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		System.out.println(f1.isHidden());
		System.out.println(f1.canWrite());
		System.out.println(f1.setWritable(false));
		System.out.println(f1.canWrite());
		
		
	}

}
