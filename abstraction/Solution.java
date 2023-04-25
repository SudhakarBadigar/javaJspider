package abstraction;
abstract class Movie{
	abstract void Hero();
	Movie(int a){
		System.out.println("Krishna");
		}
}

class Actors extends Movie{

	Actors(){
		super(1);
		System.out.println("Brahmanandam");
		System.out.println("Raviteja");
		System.out.println("Trisha");
		
	}
	@Override
	void Hero() {
		System.out.println("Ravi teja");
	}
	
}
public class Solution {

	public static void main(String[] args) {
		Actors a = new Actors();
	
		a.Hero();
	}
}
