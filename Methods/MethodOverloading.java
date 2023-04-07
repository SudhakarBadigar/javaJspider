package Methods;

public class MethodOverloading {
	
   void m1() {
		System.out.println("no argument");
	}
	
	void m1(int a){
		System.out.println("int:");
	}
	void m1(String a) {
		System.out.println("string");
	}
	void m1(String a,int b) {
		System.out.println("string : int ");
		}
	void m1(int a, String b) {
		System.out.println("int :String ");
	}
	
	public static void main(String[] args) {
		MethodOverloading mod = new MethodOverloading();
		mod.m1();
		mod.m1(10);
		mod.m1("raj");
		mod.m1(20, "sud");
		mod.m1("hanuma", 100);
				
	}
	

}
