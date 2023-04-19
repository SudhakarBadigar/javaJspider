package beverages;

class SoftDrinks{}
class Coke extends SoftDrinks{}
class Pepsi extends SoftDrinks{}
class Thumsup extends SoftDrinks {}
class Sprite extends SoftDrinks {}
class MountainDew extends SoftDrinks{}

public class CoolUp {
	SoftDrinks order(int choice){
		if(choice == 1) {
			Coke c = new Coke();
			return c;
			}
		else if(choice == 2) {
			Pepsi p = new Pepsi();
			return p;
			}
		else if (choice == 3) {
			Thumsup t = new Thumsup();
			return t;
			}
		else if(choice == 4) {
			Sprite s = new Sprite();
			return s;
		    }
		else if (choice == 5) {
			MountainDew m = new MountainDew();
			return m;
		}
		else {
			return null;
		}
	}
}
