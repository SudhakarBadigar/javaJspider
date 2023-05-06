package singleTonPattern;

public class Boy {
	int phoneno = +222222222;
	String name= "shine";
	private static Boy b;
	String location = "Bangalore";
	private Boy(int ph,String name){
		System.out.println("phoneno:" + this.phoneno);
		System.out.println("phoneno:" + ph);
		System.out.println("Name:" + this.name);
		System.out.println("Name:" + name);
	}
	

	public static Boy createobj(){
		if(b==null) {
		 b = new Boy(+98002345,"Tom");
		}
		
		 return b;
	}
	
}
