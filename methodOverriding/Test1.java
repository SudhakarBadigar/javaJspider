package methodOverriding;


class Songs{
	void m1() {
		System.out.println("Songs");
	}

}
public class Test1 extends Songs {
	@Override
	
	void m1() {
		super.m1();
		this.m2();
		System.out.println("Lyrics");
	}
	void m2() {
		System.out.println("Writer");
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
		
	}

}
