package oops;

public class StaticInstancevar {
	static int staticvar = 0;
	int instancevar = 0;
	public StaticInstancevar() {
		staticvar++;
		instancevar++;
	}
	
	public static void main(String[] args) {
		StaticInstancevar s1 = new StaticInstancevar();
		StaticInstancevar s2 = new StaticInstancevar();
		StaticInstancevar s3 = new StaticInstancevar();
		
		System.out.println("static: "+s1.staticvar);
		System.out.println("static: "+s2.staticvar);
		System.out.println("................");
		System.out.println("instance: "+s1.instancevar);
		System.out.println("instance: "+s2.instancevar);
		
	}

}
