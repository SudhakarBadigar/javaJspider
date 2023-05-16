package exceptionHanling;

import java.util.Scanner;

public class LoginForm {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter username");
			String UName = scan.next();
			
			scan.nextLine();
			System.out.println("enter password");
			String pwd = scan.nextLine();
					
			if(UName.equals("Login")) {
				System.out.println("UserName Accepted");
				if(pwd.equals("123")) {
					
					System.out.println("Password Accepted");
					System.out.println("Loged In Successfully");
			    }
			}
			
			else {
				try {
				      InvalidLoginVerificationException obj  = new InvalidLoginVerificationException();
				      throw obj;
				    }
				catch(InvalidLoginVerificationException obj) {
					obj.printStackTrace();
				}
			
			}
			
			scan.close();
		}

	}


