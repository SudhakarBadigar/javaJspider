package upCasting;
class  Father{

	int age=55;
	void work() {
		System.out.println("Farmer");
	}
}

class son extends Father{
	int age = 22;
	void study() {
		System.out.println("Engineering");
	}
}

class TestUpcast{
	public static void main(String[] args) {
		//indirect way of upCasting
//		  son s = new son();
//		   Father f = s;  
//		System.out.println(s.age);
//		System.out.println(f.age);
		//direct way of upCasting
		
		Father f = new son();
		System.out.println("Father's age"+f.age);
		System.out.println("work");
		f.work();

	   son s = (son) f;
	   s.study();
	   s.work();
	   System.out.println(s.age);
	   System.out.println(f.age);
		
		
	}
	
}

