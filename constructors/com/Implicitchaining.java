package constructors.com;

class Bike{
	Bike(int a){
		this(150000.0);
		System.out.println("Bike");
	}
	Bike(double y){
		System.out.println("Bike cost " + y+" /-");
	}
}

class car extends Bike {
	car(){
	    super(1);
		System.out.println("car");
	}
}
public class Implicitchaining {
	public static void main(String[] args) {
		car c = new car();
	}
	
	

}
