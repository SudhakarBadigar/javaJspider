package blocks;

public class Test1 {
	
	static int id = 101;
	
	//static block
	static {
		id = 102;
		
	}
	
	public static void main(String[] args) {
	
		Test1 t1 = new Test1();
    	id = 103;
		System.out.println(id);
	}
	//instance- block
	{
		id = 104;
	}

}
