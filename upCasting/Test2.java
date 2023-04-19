package upCasting;

class India {
	String PrimeMinister = "Modi";
}

class Karnataka extends India{
	String ChiefMinister ="Bommai";
}

class Telangana extends India{
	String ChiefMinister= "Naidu";
}
public class Test2 {
	public static void main(String[] args) {
		India i = new Telangana();
		if(i instanceof Karnataka) {
			Karnataka k = (Karnataka)i;
			System.out.println("Chief Minister of Karnataka is: "+k.ChiefMinister +",prime minister of india is : "+ k.PrimeMinister);
		}
		else if(i instanceof Telangana){
			Telangana t = (Telangana)i;
			System.out.println("Chief Minister of Telangana is: "+t.ChiefMinister +",prime minister of india is : "+ t.PrimeMinister);
			
		}
	}

}
