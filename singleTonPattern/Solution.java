package singleTonPattern;

public class Solution {

	public static void main(String[] args) {
		Marriage m = Marriage.getInstance();
		Marriage.getInstance();
		Marriage.getInstance();
		System.out.println("At the age :"+m.age);
		System.out.println("Location  :"+m.location);
	}
}
