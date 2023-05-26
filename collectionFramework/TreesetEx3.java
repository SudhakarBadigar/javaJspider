package collectionFramework;

import java.util.TreeSet;

class car implements Comparable<car>{
	int cost;
	
	car(int cost){
		this.cost = cost;
		
	}
	
	@Override
	public String toString() {
		return "cost: " + cost;
	}

	@Override
	public int compareTo(car c) {
		return this.cost-c.cost;
	}
	
	
}

public class TreesetEx3 {
	
	public static void main(String[] args) {
		
		car c1 = new car(400);
		car c2 = new car(100);
		car c3 = new car(200);
		car c4 = new car(300);
		
		TreeSet<car> t = new TreeSet<car>();
	
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		System.out.println(t);
		System.out.println("...............");
		for(car c : t) {
			System.out.println(c);
		}
	}

}
