//with return statement and without arguments.
package Methods;

public class Method3 {
	
	String brand(){
		return "Audi";
	}
	
	public static void main(String[] args) {
    	   Method3 m3 = new Method3();
 		   String BrandName = m3.brand();
		   System.out.println(BrandName);
		   System.out.println("...............");	
		   System.out.println(m3.brand());
	}

}
