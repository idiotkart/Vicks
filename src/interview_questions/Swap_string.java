package interview_questions;

public class Swap_string {
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Worlds";
		
		a = a+b;
		
		b = a.substring(0,a.length()-b.length());
		
		System.out.println(a);
		
		System.out.println(b.length());
		
		a = a.substring(b.length());
		
		
		
		System.out.println(a+" "+b);
	}
}
