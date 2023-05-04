package javaLibraries;

public class EqualsMethod {
	int age;
	
	public EqualsMethod(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode(){
		return 10;
	}
	
	@Override
	public boolean equals(Object obj){
		EqualsMethod e = (EqualsMethod)obj;

		return this.hashCode() == e.hashCode();
	}
	
	public static void main(String[] args) {
		EqualsMethod e1 = new EqualsMethod(22);
		EqualsMethod e2 = new EqualsMethod(22);
		//System.out.println(e1 == e2);//compares address
		System.out.println(e1.equals(e2));//compares address
		
	}

}
