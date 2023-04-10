package blocks;

public class InstanceBlock {
	int id ;
	
	{
		
		System.out.println("the value of id is " + id); 
		System.out.println("intializing to 10");
	    id = 10;
	}
	
	public static void main(String[] args) {
		InstanceBlock i = new InstanceBlock();
		System.out.println("the value of id is " + i.id);
	}

}
