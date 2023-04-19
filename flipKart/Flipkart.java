package flipKart;

class Electronics{}
class Laptop extends Electronics{}
class Mobile extends Electronics{}
class Watch extends Electronics{}
class WashingMachine extends Electronics{}

public class Flipkart {
	
	Electronics orders(int choice) {
		if(choice == 1) {
			Laptop l = new Laptop();
			return l;
		}
		else if(choice ==2) {
			Mobile m = new Mobile();
			return m;
		}
		else if (choice ==3) {
			Watch w = new Watch();
			return w;		
		}
		else if(choice == 4) {
			WashingMachine wm = new WashingMachine();
			return wm;
		}
		else {
			return null;
		}
	}

}
