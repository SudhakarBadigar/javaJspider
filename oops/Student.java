package oops;

public class Student {

	//non static
	int age = 20;
	String name = "Ram";
	char c;
	
	/*static  
	 * static variable and non static variable can have default value but not local variables*/
	static int cost = 2000;
	
	public static void main(String[] args) {
	
		//local variable
		String name = "krishna";
		
		/* local variables doesn't have default values it has to be initialized or else we get compile error  
		  
		int c ;
		System.out.println(c); */
		
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.c);// char don't have any default value hence it gives empty space
		System.out.println(name);
		price.m1();
		price p = new price();
		p.m2();
	
	}
}
	
	class price{
		public static void m1() {
			System.out.println(" " + Student.cost);			
		}
		
		public void  m2() {
			Student s = new Student();
			System.out.println("price class m2 metod: " + s.name);
			
		}
	}

