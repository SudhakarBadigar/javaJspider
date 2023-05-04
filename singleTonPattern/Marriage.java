package singleTonPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Marriage {
	int age = 30;
	String location="mysore";
	
//	Date date = new Date();
//	SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
//	Date specificDate = new Date(08-12-2008);
	
	private static Marriage m;
	
	private Marriage(){
		System.out.println("Married");
		
	}
	
	public static Marriage getInstance(){
		if(m==null) {
		m = new Marriage();
		}
		return m;
	}

}
