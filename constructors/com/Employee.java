package constructors.com;

public class Employee {
	int id;
	String Name;
	double salary;
	
	Employee(int id,String Name,double salary){
		this.id=id;
		this.Name=Name;
		this.salary=salary;
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Rajesh", 12000.45);
		Employee e2 = new Employee(102, "Kadir", 1000.22);
		Employee e3 = new Employee(103, "pratap", 8000.48);
		Employee e4 = new Employee(104, "sanjay", 7000.91);
		
		System.out.println(e1.id);
		System.out.println(e1.Name);
		System.out.println(e1.salary);
		System.out.println("...........................");
		System.out.println(e2.id);
		System.out.println(e2.Name);
		System.out.println(e2.salary);
		System.out.println("...........................");
		System.out.println(e3.id);
		System.out.println(e3.Name);
		System.out.println(e3.salary);
		System.out.println("............................");
		System.out.println(e4.id);
		System.out.println(e4.Name);
		System.out.println(e4.salary);
		
		
	}

}
