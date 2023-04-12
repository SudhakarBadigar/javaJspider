package inheritance;

class Connie{
	String schoolName = "connie english medium";
	
	void sports(){
		System.out.println("connie conducted more sports");
	}
}

class National extends Connie{
	String collegeName ="National college";
	
     void Labs(){
    	 System.out.println("they had totally 4 labs");
     }
}

class DrAit extends National{
	String hostel = "Mens Hostel";
	 void food(){
		System.out.println("it has North indian and south indian food");
	}
}


public class MultiLevel {
	public static void main(String[] args) {
		DrAit dr = new DrAit();
		System.out.println(dr.schoolName);
		System.out.println(dr.collegeName);
		System.out.println(dr.hostel);
		System.out.println(".....................");
		dr.sports();
		dr.Labs();
		dr.food();
		
	}

}
