package constructors;

public class Age {
	
	int age;
	Age(int b){
	
		System.out.println(age);
		age=b;
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Age a = new Age(22);	
		Age a1 = new Age(25);	
		Age a2 = new Age(12);	
		
		System.out.println("end");
		
	}

}
