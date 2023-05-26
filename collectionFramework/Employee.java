package collectionFramework;
class Employee implements Comparable<Employee>{
	int id;
	String name;
	Double salary;
	
	Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		}
	
	@Override
	public String toString() {
		return "id: "+id + " Name: "+ name +"   Salary: " +salary ;
	}
	
	
// compare with id	
//	@Override
//	public int compareTo(Employee obj){
//		return this.id-obj.id;
//	}

	
//	compare with name
//	@Override
//	public int compareTo(Employee obj) {
//		return this.name.compareTo(obj.name);	
//	}
	
	
//	compare with salary
	
	@Override
	public int compareTo(Employee e) {
		return e.salary.compareTo(this.salary);
		
	}
	
	
	
}