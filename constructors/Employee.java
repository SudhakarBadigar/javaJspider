package constructors;

public class Employee {
	int age;
	String name;
	double sal;
	char gender;
	
	Employee(int age, String name, double sal,char gender){
		age= 55;
		System.out.println(age);
		this.name = name;
		this.sal=sal;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(22,"Aditya",200000.00,'M');
		Employee e2 = new Employee(20,"Surya",120000.405,'M');
		Employee e3 = new Employee(33,"prema",50000.10,'F');
		Employee e4 = new Employee(31,"sujata",10000.00,'F');
		System.out.println(e1.age);
		System.out.println(e1.name);
		System.out.println(e1.sal);
		System.out.println(e1.gender);
		System.out.println(".......................");
		System.out.println();
		System.out.println(e2.age);
		System.out.println(e2.name);
		System.out.println(e2.sal);
		System.out.println(e2.gender);
		System.out.println(".......................");
		System.out.println();
		System.out.println(e3.age);
		System.out.println(e3.name);
		System.out.println(e3.sal);
		System.out.println(e3.gender);
		System.out.println(".......................");
		System.out.println(e4.age);
		System.out.println(e4.name);
		System.out.println(e4.sal);
		System.out.println(e4.gender);
		System.out.println(".......................");
	}
	
	

}
