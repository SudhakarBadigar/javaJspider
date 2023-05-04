package singleTonPattern;

public class Account {
	
	private static Account obj = null;
	
	private Account(){
		System.out.println("object created");
	}
	
	//helper or factory method
	public static void sud(){
		if(obj==null) {
		    obj = new Account();
		}
		else {
			System.out.println("Cannot create object");
		}
	}

}
