package singleTonPattern;

public class AadharCard {
	
	private static AadharCard a1;
	private AadharCard(){
		System.out.println("object created");
	}
	
	public static void createObject(){
		if(a1==null) {
			System.out.println(a1);
		   a1 = new AadharCard();
		   System.out.println(a1);
	  	}
		else {
			
			System.out.println("object cannot be created");
		}
	}

}
