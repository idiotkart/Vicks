package interview_questions;

public class Swap_numbers {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 11;
		int t;
		
		System.out.println("Before "+"X is "+x+" Y is "+y);
		/*
		 * t = x; x = y; y = t
		 */;
		 
		 x = x+y;
		 
		 y = x-y;
		 
		 x = x-y;
		
		System.out.println("After "+"X is "+x+" Y is "+y);
	}
	
	
			

}
