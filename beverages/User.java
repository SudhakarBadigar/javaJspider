
package beverages;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*********");
		System.out.println("what soft drinks do you like?");
		int num=scan.nextInt();
		
		CoolUp c = new CoolUp();
		SoftDrinks obj = c.order(num);
		if(obj instanceof Coke) {
			System.out.println("coke");
		}
		else if(obj instanceof Pepsi) {
			System.out.println("Pepsi");
		}
		else if(obj instanceof Thumsup) {
			System.out.println("ThumsUp");
		}
		else if(obj instanceof Sprite) {
			System.out.println("Sprite");
		}
		else if (obj instanceof MountainDew) {
			System.out.println("Mountain Dew");
		}
		else {
			System.out.println("Hope we see soon shortly!");
		}
		scan.close();
		
	}

}
