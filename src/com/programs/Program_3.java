package com.programs;

import java.util.Arrays;

// --> 1 to 100 without using Loop and Recursion
public class Program_3 {
	
	public static void main(String[] args) {
		
		Object ob[] = new Object[100];
		
		Arrays.fill(ob, new Object() {
			
			int count = 0;
			
			public String toString()
			{
				return Integer.toString(++count);
			}
			
		});
		
		System.out.println(Arrays.toString(ob));
	}

}
