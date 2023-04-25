package interfaceKeyword;

interface Person{
  public static final String name = "Tom";	
  public  abstract void eat();
}

public class Interface1 implements Person
{
@Override
public void eat(){
	System.out.println("Eating");
	
}

public static void main(String[] args) {
	System.out.println(Person.name);
	Interface1 i = new Interface1();
	i.eat();
}
}
