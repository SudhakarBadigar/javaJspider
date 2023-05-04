package singleTonPattern;

public class Primeminister {
	
	String pm = "modi";
	
	private static Primeminister p;
	
	private Primeminister(){
		System.out.println("PrimeMinister is " + this.pm);
	}
	
	public static Primeminister createPmObject(){
		if(p==null) { 
		  p = new Primeminister();
		}
		else
		{
			System.out.println("cannot have more than one pm ");
		}
		return p;
	}

}
