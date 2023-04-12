package methodOverriding;

class WhatsAppVersion1{
	void display()
	{
		System.out.println("singletick");
		//System.out.println("....................");
	}
}

class WhatsAppVersion2 extends WhatsAppVersion1{
	@Override
	void display() {
		super.display();
		System.out.println("Double tick");
	//	System.out.println(".........................");
	}
	
	void call(){
		System.out.println("voice call");
		//System.out.println("..........................");
	}
}

class WhatsAppVersion3 extends WhatsAppVersion2{
	@Override
	void display() {
		super.display();
		System.out.println("Blue Double Tick");
	//	System.out.println("......................");
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("video call");
//		System.out.println(".........................");
	}
	 
	void pics() {
		System.out.println("images uploading");
	}
}

public class Whatsapp {

	public static void main(String[] args) {
		WhatsAppVersion3 w = new WhatsAppVersion3();
		System.out.println("version 1.0");
		w.display();
		System.out.println(".....................");
		System.out.println("version 2.0");
		w.call();
		System.out.println(".....................");
		System.out.println("version 3.0");
		w.pics();
		System.out.println("..........");
		WhatsAppVersion1 w1 = new WhatsAppVersion1();
		
		System.out.println("whatsapp version 1.0");
		w1.display();
		
	}
}
