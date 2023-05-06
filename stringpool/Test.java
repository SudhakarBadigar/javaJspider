package stringpool;

public class Test {

	public static void main(String[] args) {
		
	String name = "software:Developer";
	int count = 0;
	char c= 's';
	for(int i =0;i< name.length();i++) {
		if(name.charAt(i)== c) {
			//System.out.println("index number where "+c+ " occured :"+i);
			count++;
			
			}
	}
	System.out.println("No of times "+ c+" occured :"+count);
	}
}
