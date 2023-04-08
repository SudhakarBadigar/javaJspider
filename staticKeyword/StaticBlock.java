package staticKeyword;

public class StaticBlock {
	
	static {
		//System.out.println(StaticBlock.age);
		StaticBlock.age = 10;
		System.out.println(StaticBlock.age);
	}
	
	static int age ;
	
	public static void main(String[] args) {
		System.out.println("main Block");
		System.out.println(StaticBlock.age);
	}

}
