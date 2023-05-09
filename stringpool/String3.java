package stringpool;

public class String3 {

	public static void main(String[] args) {
		String s1 = new String("mava");
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		//System.out.println(s1.split("_"));

		System.out.println("..........");
		String s2 = "java";
		System.out.println(s2.substring(2));
		System.out.println(s2.codePointAt(1));//ascii value
		System.out.println(s2.compareTo(s1));  
		
//		if(s2.indexOf('e') > s2.charAt(6)) {
//			
//			System.out.println(s2.indexOf('e'));
//		}
	} 
}
