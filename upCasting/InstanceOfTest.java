package upCasting;
class Vehicle1{
	String Brand = "Audi";
}
class Biker extends Vehicle1
{
	int cost = 55000;
}
class Cars extends Vehicle1{
	int cost = 650000;
	
}

public class InstanceOfTest {
	public static void main(String[] args) {
		Vehicle1 v = new Biker();
		Vehicle1 v1 = new Cars();
		
		if(v instanceof Biker) {
			Biker b = (Biker)v;
			System.out.println(b.Brand + ":" + b.cost);
		}
		else if(v1 instanceof Cars){
			Cars c = (Cars)v1;
			System.out.println(c.Brand + ":"+ c.cost);
		}
	}

}
