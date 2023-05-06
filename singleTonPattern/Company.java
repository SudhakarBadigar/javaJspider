package singleTonPattern;

public class Company {
	public static void main(String[] args) {
		Boy b = Boy.createobj();
		Boy.createobj();
		Boy.createobj();
		Boy.createobj();
		Boy.createobj();
//		System.out.println(b.phoneno);
//		System.out.println(b.name);
//		System.out.println(b.location);
	}

}
