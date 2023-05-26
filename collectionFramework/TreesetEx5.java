package collectionFramework;

import java.util.TreeSet;

public class TreesetEx5 {
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(101,"Rama",75000.25);
	Employee e2 = new Employee(103,"Hanuma",65000.22);
	Employee e3 = new Employee(104,"Krishna",70000.66);
	Employee e4 = new Employee(102, "sudhakar", 50000.526);
		
	System.out.println(e1);
	System.out.println(".............");
	TreeSet<Employee> t = new TreeSet<Employee>();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	
	for(Employee e : t) {
		System.out.println(e);
	}
	
	
	
	
	}

}
