package methodOverriding;
class Tom{
	Tom(){
		System.out.println("Tom constructor");
	}
	int age;
	void name() {
		this.age=20;
		System.out.println("Tom is my Name");
	}
}

class Tim extends Tom{
//	@Override
//	void name() {
//		super.name();
//		System.out.println("Tim is my Name");
//		
//	}
}
public class Example1 {
	public static void main(String[] args) {
		Tim t = new Tim();
		t.name();
		
	}

}
