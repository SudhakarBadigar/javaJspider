package Basic;

import java.math.BigInteger;

public class EvenOdd {

	public static void main(String[] args) {
		/*//for big numbers we can use this 
	//	BigInteger Number = new BigInteger("1099999999999999999999999999999999999999999999999999999999999999999994");
		//in bigInteger % will not work it work only in primitive datatypes biginteger is an object.
		if(Number.testBit(0)) {
			System.out.println("the Number " + Number +" is odd " );
		}
		else {
			System.out.println("the Number " + Number +" is even ");
		}
		
		System.out.println("...............................................");*/
		
		// for small numbers we can use this 
				int Number1 = 10;
				if((Number1 % 2 ) == 0) {
					System.out.println("the Number " + Number1 +" is even " );
				}
				else {
					System.out.println("the Number " + Number1 +" is Odd ");
				}
			}
	}
