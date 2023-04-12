package constructors.com;
class Company{
	int regNo;
	String Brand;
	String color;
	double cost;
	String country;
	
	Company(){
	    this("Suzuki");
	    this.regNo=101;
		System.out.println("RegNo: "+this.regNo);
	}
	Company(String Brand){
		this(250000.00,"Austria");
		this.Brand="suzuki";
		System.out.println("Brand: "+this.Brand);
	}
	
	
	Company(double cost, String Country){
        this.cost= 25000.00;
        this.country="Japan";
        System.out.println("cost : " + this.cost);
        System.out.println("country : " + this.country);
        
		
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		Company c1 = new Company();
		
	}
	

}
