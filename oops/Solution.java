package oops;

 class Employee {
	int id;
	String name;
	double salary;
	static int bonus = 200;
}

public class Solution{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.id=101;
		e1.name ="Guru";
		e1.salary = 12345.23;
		
		e2.id= 102;
		e2.name = "madhava";
		e2.salary= 200000.32;
		
		e3.id=103;
		e3.name="hanuman";
		e3.salary=10000000.39;
		System.out.println(Employee.bonus);
		Employee.bonus=500;
		System.out.println(Employee.bonus);
		System.out.println("id = " + e1.id + " Name =  " + e1.name + " Salary =  " + e1.salary);
		System.out.println("id = " + e2.id + " Name = " + e2.name + " Salary = " + e2.salary);
		System.out.println("id = " + e3.id + " Name = " + e3.name + " Salary = " + e3.salary);
	}
}
