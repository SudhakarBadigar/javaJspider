
//with return statement without argument
package Methods;

public class AddMethod4 {
	
	int add(){
        return 10;		
	}
	
	public static void main(String[] args) {
		AddMethod4 a = new AddMethod4();
		int add = a.add();
		System.out.println(add);
	}

}
