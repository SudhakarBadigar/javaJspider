package inheritance;
 class Father{
	 String LastName="sharma";
	 
	   void properties(){
		   System.out.println("car");
		   System.out.println("home");
		   System.out.println("crop field");
	   }
 }
 
 class son1 extends Father{
	
	  //super.properties();
	  String name = "mohan";
//	 void  properties() {
//		// System.out.println("laptop");
//	 }
 }
 class son2 extends Father{
	 String name = "prathap";
	 	
	 String properties(String m) {
		 return m;
	 }
	  
 }

public class Hierarchical {
    public static void main(String[] args) {
		
    	son1 s1 = new son1();
    	System.out.println(s1.name + " " + s1.LastName );
    	s1.properties();
    	System.out.println("..................................");
    	son2 s2 = new son2();
    	System.out.println(s2.name + " " + s2.LastName );
    	String property1 = s2.properties("Desktop");
    	System.out.println(property1);
    	
	} 
}
