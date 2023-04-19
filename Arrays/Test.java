package Arrays;

public class Test {
	public static void main(String[] args) {

		String []name= {"modi","modi","rahul","bsy","priyanka"};
		String element= "BSY";
		int count = 0;
		for(int i=0;i<name.length;i++) {
			if(element == name[i]) {
				count++;

			}
			
		}
		System.out.println(element + " Appeared : " +count);
	}

}
