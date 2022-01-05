package com.programs;

import java.util.ArrayList;

public class Compare_two_ArrayList {
	
public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		for(int i=0; i<4; i++)
		{
			al1.add(i);
		}
		
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) 
		{
			al2.add(i);
		}
		
		System.out.println(al2);
		
		//to find out additional elements
		
		//al2.removeAll(al1);
		
		//al1.removeAll(al2);
		
		
		System.out.println(al2.removeAll(al1));
		System.out.println(al2);
		
		//System.out.println(al2);
		
		//find out the common elements
		
		//al1.retainAll(al2);
		
		al2.retainAll(al1);
		
		//System.out.println(al1);
		
		//System.out.println(al2);
		
		
	}

}
