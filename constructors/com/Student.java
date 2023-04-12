package constructors.com;

public class Student {
	int id;
	String Name;
	String course;
	double fees;
	
	Student(int id,String Name,String course,double fees) {
		this.id=id;
		this.Name=Name;
		this.course=course;
		this.fees= fees;
	}
	
	void display(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.Name);
		System.out.println("Course: "+ this.course);
		System.out.println("Fees:" + this.fees);
		System.out.println("................................");
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "Rajesh","java", 9949.49);
		Student s2 = new Student(102,"mohan","React",7999.99);
		Student s3 = new Student(103,"Suraj","Aws",19949.49);
		Student s4 = new Student(104, "bunty","javascript",4499.99);
		Student s5 = new Student(105, "pooja","Angular",1000);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	}

}
