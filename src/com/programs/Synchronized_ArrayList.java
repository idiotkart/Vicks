package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Synchronized_ArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> al = Collections.synchronizedList(new ArrayList<Integer>());
		
		for(int i=0; i<30; i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		
		/*
		 * synchronized (al) { Iterator<Integer> it = al.iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); } }
		 */
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
