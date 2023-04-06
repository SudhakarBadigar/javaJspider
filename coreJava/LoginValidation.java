package coreJava;

public class LoginValidation {

	public static void main(String[] args) {
		
		String username = "Goldman Sachs";
		String password = "Gold123";
		
		if(username == "Goldman Sachs") {
			if(password == "Gold123") {
				System.out.println("Welcome to GoldMan Sachs:)");
				}
			else {
				System.out.println("the password is not correct:(");
			}
		}
		else {
			System.out.println("please enter the correct user id");
		}

	}

}
