package javaLibraries;

public class HashCode {
	
	@Override
	public int hashCode() {
		return 124;
	}
	
	public static void main(String[] args) {
		HashCode hc1 = new HashCode();
		HashCode hc2 = new HashCode();
		
		System.out.println(hc1.hashCode());
		System.out.println(hc2.hashCode());
	}

}
