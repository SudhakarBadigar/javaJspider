package stringpool;

public class Demo1 {
	
	public Demo1(String n) {
		System.out.println("constructor");

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1("hai");
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.hashCode());
		
		System.out.println("............");
		
		String s = new String();//Ascii of 'j'
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	}
}
