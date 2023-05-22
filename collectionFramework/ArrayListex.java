package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListex {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		l.set(2, 70);
		System.out.println(l);
		System.out.println("...........");
		String[] names = {"sud","murali","madhav","krishna"};
		int[] num = {10,40,20,50,66,99,4};
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		
		
	}

}
