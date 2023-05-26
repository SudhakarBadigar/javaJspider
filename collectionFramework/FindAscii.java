package collectionFramework;
import java.util.Scanner;

	public class FindAscii {

		public static int getAsciiValue(Object obj) {
	        String str = String.valueOf(obj);
	        int asciiValue = 0;
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            asciiValue =  (int)ch;
		            System.out.println("ASCII value of '" + ch + "': " + asciiValue);
		        }
	        return asciiValue;
	    }

		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an object: ");
	        Object input = scanner.nextLine();

	        int asciiValue = getAsciiValue(input);
	        System.out.println("ASCII value: " + asciiValue);

	        scanner.close();
	    }
	}

	

