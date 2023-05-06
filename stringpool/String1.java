package stringpool;

public class String1 {
	
	String s1 = "java";
	String s2 = new String("sql");
	String s3 ="java";
	String s4 = new String("sql");
	public static void main(String[] args) {
		String1 s = new String1();
		System.out.println("double equals operator: "+(s.s1 == s.s3));
		System.out.println("equals method: " + (s.s1.equals(s.s3)));
		System.out.println("...........");
		System.out.println("double equals operator:" + (s.s2 == s.s4));//false
		System.out.println("equals method: " + (s.s2.equals(s.s4)));//true
	}

	
}
