package constructors.com;

public class Demo {
	 Demo( int a){
		 System.out.println("Demo constructor");
		 System.out.println(a);
		m1();
	 }
	 Demo(){
          System.out.println("non parameterizd");		 
	 }
	 
	 void m1() {
		 System.out.println("this is m1 method");
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println("start");
		 Demo d1 = new Demo(10000);
		 d1.m1();
		 
		 System.out.println("....................");
		 new Demo();
		 
		 System.out.println("end");
		
	}

}
