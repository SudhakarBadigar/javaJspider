package interfaceKeyword;

interface Tester {
	String TesterName="Harry"; 
	default  void Test() {
		System.out.println("Static Test");
	}

}
