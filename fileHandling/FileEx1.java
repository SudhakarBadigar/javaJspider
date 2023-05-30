package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("./DemoFile1.txt");
		f.createNewFile();
		System.out.println(f.exists());
		f.delete();
 		System.out.println(f.exists());
	}

}
