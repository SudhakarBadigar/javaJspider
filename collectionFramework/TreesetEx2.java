package collectionFramework;

public class TreesetEx2 {

	int cost;
	public TreesetEx2(int cost) {
		System.out.println(this.cost);
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "cost:" + cost;
	}

	

	
	public static void main(String[] args) {
		TreesetEx2 t1= new TreesetEx2(100);
		System.out.println(t1.cost);
		System.out.println(t1);
	}

}
