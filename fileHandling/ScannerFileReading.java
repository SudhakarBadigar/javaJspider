package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFileReading {
	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");

		if(!f.exists())
			f.createNewFile();
		
		Scanner scan = new Scanner(f);
		
		
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
				
		scan.close();
	}

}
