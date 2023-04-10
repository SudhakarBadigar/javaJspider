package constructors;

public class car {
	String place = "Dharmasthala";
	car(){
		System.out.println("this is constructor");
		//not a good practice.
		car c = new car();
		System.out.println(c.place);
	}
	
	public static void main(String[] args) {
		car c = new car();
		System.out.println("start");
		
		System.out.println("end");
		
	}

}
