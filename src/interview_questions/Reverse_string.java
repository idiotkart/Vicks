package interview_questions;

public class Reverse_string {
	
	public static void main(String[] args) {
		
		String s = "BOOB";
		
		int len = s.length();
		
		String rev = "";
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}
	}
}
