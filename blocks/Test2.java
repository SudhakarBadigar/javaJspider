package blocks;

public class Test2 {

	int id = 10;
	
	{
		id = 20;
	}
	
	public static void main(String[] args) {
		Test2 t1= new Test2();
		t1.id = 30;
		System.out.println(t1.id);
	}
	static 
	{
	
		//*id=30; inside static block we cannot update the instance variable.but inside the 
		//   instance block we can update static values./* 
	}
}
