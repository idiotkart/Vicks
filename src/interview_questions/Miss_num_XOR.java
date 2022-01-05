package interview_questions;

public class Miss_num_XOR {
	
	public static void main(String[] args) {
		
		int a[] = {10,11,12,14};
		
		int x1 = a[0];
		int x2 = 10;
		
		for(int i=1; i<a.length; i++)
		{
			x1 = x1^a[i];
			
		}
		
		for(int i=11;i<=a.length+1;i++)
		{
			x2 = x2^i;
		}
		
		System.out.println((x1^x2));
	}

}
