package interview_questions;

public class Small_Large {
	
	public static void main(String[] args) {
		int num[] = {-11, 23, 56, 78, 89};
		
		int small = num[0];
		int large = num[0];
		
		for(int i=1; i<num.length; i++)
		{
			if(num[i]> large)
			{
				large = num[i];
			}
			
			else if(num[i]<small)
			{
				small = num[i];
			}
		}
		
		System.out.println("Largest number "+large+" Smallest number "+small);
	}
	

}
