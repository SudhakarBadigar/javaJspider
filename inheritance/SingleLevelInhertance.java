package inheritance;

class father1{
	int age = 50;
	String name= "krishna";
	
}

class son extends father1{
	String name= "chandra";
}
 

public class SingleLevelInhertance {
     public static void main(String[] args) {
		son s = new son();
		father1 f = new father1();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(f.name);
	}
}
