package javaLibraries;

public class ToString {
	int age;
	String name;
	
	ToString(int age, String name){
		this.age = age;
		this.name=name;
	}
	
	public String toString(){
		return " Age: " +this.age + " Name: " + this.name  ;
	}
	public static void main(String[] args) {
		ToString t1 = new ToString(22,"Tom");
		ToString t2 = new ToString(23,"Tim");
		ToString t3 = new ToString(24,"Cook");
		ToString t4 = new ToString(23,"Hilghfier");
		
		
		ToString[] t = {t1,t2,t3,t4};
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i]);
			
			}
	}
}
