package interview_questions;

public class Reverse_integer {
	
	public static void main(String[] args) {
		
		int num = 3457;
		
		int rev = 0;
		
		
		for(;num!=0;)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		System.out.println(rev);
	}

}
