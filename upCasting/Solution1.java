package upCasting;

class Table {
	String name = "Table";
	int cost = 10000;

}

class PlasticTable extends Table {
	String name = "Plastic Table";
	int cost = 4000;

}

class WoodTable extends Table {
	String name = "Wood Table";
	int cost = 8000;
}

public class Solution1 {
	public static void main(String[] args) {
		System.out.println("Start");
		//Table t = new WoodTable();
		Table t = new PlasticTable();
		if(t instanceof PlasticTable ) {
			System.out.println("Downcasting to Plastic Table");
			PlasticTable p = (PlasticTable)	t;
			System.out.println("Table cost is :"+ t.cost);
			System.out.println("Table Name is :"+ t.name);
			System.out.println("Plastic Table cost is : " + p.cost);
			System.out.println("Plastic Table Name is : " + p.name);
			
		}
		else if(t instanceof  WoodTable) {
			System.out.println("Downcasting to Wood Table");
			WoodTable w = (WoodTable) t;
			System.out.println("Table cost is : " + t.cost);			
			System.out.println("Table Name is : " + t.name);
			System.out.println("Wood Table cost is : " + w.cost);
			System.out.println("Wood Table Name is : " + w.name);
		}
		System.out.println("End");
		

	}

}
