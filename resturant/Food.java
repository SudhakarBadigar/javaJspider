package resturant;

class Food {

}
class Breakfast extends Food{
	
}
class Lunch extends Food{
	
}
class Snacks extends Food{
	
}
class Dinner extends Food{
	
}
class Coffee extends Food{
	
}
class Hotel{
	//method orderfood has a return type which is a class(Food) that is non primitive datatype.
	 Food  orderfood(int choice){
		 if(choice ==1) {
			 Breakfast b = new Breakfast();
			 return b;
		 }
		 else if(choice == 2) {
			Lunch l = new Lunch(); 
			return l;
		 }
		 else if(choice == 3) {
			 Snacks s = new Snacks();
			 return s;
		 }
		 else if (choice ==4) {
			 Dinner d = new Dinner();
			 return d;
		 }
		 else if (choice == 5) {
			 Coffee c = new Coffee();
			 return c;
		 }
		 else {
			 return null;
		 }
		 
		
	}

}