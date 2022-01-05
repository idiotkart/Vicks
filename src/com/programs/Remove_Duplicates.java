package com.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

//remove duplicates from the arraylist
public class Remove_Duplicates {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<=10; i++)
		{
			al.add(i);
		}
		
		for(int i=0; i<=10; i++)
		{
			al.add(i);
		}
		
		//System.out.println(al.hashCode());
		
		System.out.println(al);
		
		
		 LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		 
		 System.out.println(lhs);
	}
	

}
