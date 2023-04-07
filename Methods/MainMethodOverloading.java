package Methods;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("start");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("hanuman");
		MainMethodOverloading.main(1000.11);
	//	System.out.println(MethodOverloading.main(23.2));
		System.out.println("end");
		
	}
	public static double main(double d) {
		System.out.println("iq:" + d);
		return d;
	}
	public static void main(int a) {
		System.out.println("age : " + a);
		
	}
	public static void main(String b) {
		System.out.println("Name : " + b);
	}
}
