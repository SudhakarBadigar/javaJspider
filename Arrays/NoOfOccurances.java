package Arrays;

public class NoOfOccurances {
	public static void main(String[] args) {
		String[] Student = {"Raj","soma","soma","Raj","raj","vignesh","vignesh","madan","chopra"};
		int count=0;
		
		for(int i=0; i<Student.length; i++) {
			
			if(Student[i] == Student[i]) {
				
				System.out.println(Student[i] +":" + count++);
			}
			else {
				System.out.println(Student[i] +":"); 
			}
		}
				
	}

}
