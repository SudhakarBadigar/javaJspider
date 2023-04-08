package staticKeyword;

public class Student {
	
	static int age =20;

	static void study() {
		System.out.println("studying over here");
	}
	
	public static void main(String[] args) {
		//int age = 30;
		System.out.println("start");
		// this is not recomendedif local variable is present then it will execute the local not the static 
		System.out.println(age);
		Student.age = 50;
		System.out.println(Student.age);
		Student.study();
		study();//it is not recomended
		System.out.println("end");
	}
	
	

}

