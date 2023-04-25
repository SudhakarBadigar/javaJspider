package interfaceKeyword;

public class ProInstitute extends Employee implements Developer,Tester  {
	@Override
	public void develop(){
		System.out.println("Developer teaches Java");
	}
//	@Override
//	public void Test(){
//		System.out.println("Tester teaches Selenium");
//		
//	}
	public static void main(String[] args) {
		System.out.println("Developer: "+Developer.DevName);
		System.out.println("Tester: "+Tester.TesterName);
		//Employee e = new Employee();
		ProInstitute p = new ProInstitute();
		System.out.println("Employee: "+p.name);
		p.develop();
		p.Test();
		p.work();
	}
	

}
