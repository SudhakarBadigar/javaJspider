package Methods;
class Demo{
	void display(){
	 System.out.println("Hello");	
	}
}
 class Method1 {
	public static void main(String[] args) {
		System.out.println("start");
		Demo d = new Demo();
		d.display();
		System.out.println("end");
	}

}
