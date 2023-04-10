package blocks;



public class StaticBlock {

	static {
		StaticBlock st1 = new StaticBlock();
		System.out.println("this is a static block");
	}
	public static void main(String[] args) {
		main("main");
		
		System.out.println("this is main method");
		
		
	}
	public static void main(String a) {
		
        System.out.println("this is main method with int argument");		
	}
	
	{
		System.out.println("this is istance block");
	}
}
