package abstraction;
 
abstract class Developer{
	abstract void dev();
}

public class Employee extends Developer{
	
	@Override
	void dev(){
		System.out.println("Developer is working");	
	}
	public static void main(String[] args) {
		Developer d  = new Employee();
		d.dev();
		
	}

}
