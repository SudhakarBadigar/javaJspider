package calculatorUsingAbstraction;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		System.out.println("*************Calculator**************");

		while (true) {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Percentage\n6.Exponential\n7.Modulus Of Two Numbers");

			System.out.println("..........................");
			//Solution s = (Solution) c;
			System.out.println("Enter the choice ");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
							Calculator c = new Solution();
				
				switch (choice) {
				case 1:
					System.out.println("Enter Twooooo Numbers");
					double add1 = scan.nextDouble();
					double add2 = scan.nextDouble();
					c.addition(add1, add2);
					break;
				case 2:
					System.out.print("Enter two Numbers");
					double sub1 = scan.nextDouble();
					double sub2 = scan.nextDouble();
					c.subtract(sub1, sub2);
					break;

				case 3:
					System.out.print("Enter Two Numbers");
					double mul1 = scan.nextDouble();
					double mul2 = scan.nextDouble();
					c.multiplication(mul1, mul2);
					break;

				case 4:
					System.out.print("Enter Two Numbers");
					double div1 = scan.nextDouble();
					double div2 = scan.nextDouble();
					c.division(div1, div2);
					break;

				case 5:
					System.out.print("Enter the Number");
					double per1 = scan.nextDouble();
					System.out.println("Enter the RateOf Interest you want to find");
					double percentage = scan.nextDouble();
					c.percentage(percentage,per1);
					break;

				case 6:
					System.out.print("Enter The Number");
					double exp = scan.nextDouble();
					c.exponential(exp);
					break;
					
				case 7:
					System.out.print("Enter The Two Numbers");
					double mod1 = scan.nextDouble();
					double mod2 = scan.nextDouble();
					c.modRemainder(mod1, mod2);
					break;
					
				case 8:
					System.out.println("thank you for using.");
					System.exit(0);

				default:
					System.out.println("invalid choice");
				}
				System.out.println("..................");
			}

		}
	}


