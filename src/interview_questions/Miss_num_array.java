package interview_questions;

public class Miss_num_array {
	
	public static void main(String[] args) {
		
		int a[] = {0,1,2,4};
		
		int act_len = a.length+1;
		
		int tot_sum = ((act_len+1)*(act_len+2))/2;
		
		int sum = 0;
		
		for(int i=0; i<a.length;i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("Total sum "+tot_sum);
		System.out.println("Sum of ele "+sum);
		
		System.out.println("Missing Number is "+Math.abs((tot_sum-sum)));
	}

}
