package upCasting;
class Mother{
	int x = 10;
}
class Brother extends Mother{
	int x= 20;
	
}
class Sister extends Mother{
	int x = 30;
}


public class InstanceOf1 {
	public static void main(String[] args) {
		Mother m = new Brother();
		//Sister s = (Sister)m;
		//Brother b = (Brother) m;
		System.out.println(m.x);
		//System.out.println(b.x);
		System.out.println(m instanceof Brother);
		System.out.println(m instanceof Mother);
		System.out.println(m instanceof Sister);
	}

}
